/*
		StudentService는
				학생정보를 저장/조회/삭제/변경하는 기능을 제공하는 클래스다.
*/
public class StudentService{

		private Student[] db = new Student[5];

		public StudentService(){
			db[0] = new Student(23, 3, "홍길동","010-1111-1111");
			db[1] = new Student(25, 1, "김유신","010-2222-1111");
			db[2] = new Student(26, 2, "강감찬","010-3333-1111");
			db[3] = new Student(21, 3, "이순신","010-4444-1111");
			db[4] = new Student(29, 4, "권율","010-5555-1111");
		}
			//학번을 전달받아서 그 학번에 해당하는 학생정보를 반환하는 메소드
			public Student getStudentByNo(int no){
					Student result = null;
				//for(Student s :db){
					//if(s.getNo()==no)

				//}
				return null;
			}

			//학년을 전달받아서 그 학년에 해당하는 학생정보를 반환하는 메소드
			public Student[] getStudentByGrade(int grade){
					Student[] result = null;
					
					Student[] temp = new Student(db.length);
					int position = 0;
					for(Student s:db){
						if(s.getGrade()==grade){
							temp[position]=s;
							position++;
						}

					}
					result = new Student[position];
					for(int i=0;i<position;i++){
					result[i]=temp[i];
					}
					return result;
			}

			//학생정보를 전달받아서 그 학번에 해당하는 학생정보를 변경하는 메소드
			public void change(Student student){
			for(int i=0;i<db.length;i++){
				Student s = db[i];
				if(s.getNo()==student.getNo()){
					db[i]=student;
					
					System.out.println("학번:"+db[i].getNo());
					System.out.println("이름:"+db[i].getName());
					System.out.println("전번:"+db[i].getPhone());
					System.out.println("학년:"+db[i].getGrade());
				}
			}
				
			}
		}
