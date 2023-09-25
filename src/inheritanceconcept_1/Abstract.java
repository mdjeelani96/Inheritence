package inheritanceconcept_1;


	abstract class parent2{
		public parent2() {
			System.out.println("this is base ");
		}
			public void sayhello() {
				System.out.println("hello");
			}
			abstract public void greet();
			abstract public void greet2();
			
		}
		class Child2 extends parent2{
			@Override
			public void greet() {
				System.out.println("good morning");
			}
			@Override
			public void greet2() {
				System.out.println("good afternoon");
				
			}}
		abstract class Child3 extends parent2{
			public void Th() {
				System.out.println("iam good");
			}
			
			
		}

		public class Abstract {

			public static void main(String[] args) {
				// parent p = new parent(); ----error
				Child2 c2 = new Child2();
				//child3 c3 = new child3(); --- error

				System.out.println("hello");
				System.out.println("good morning");
				System.out.println("good afternoon");
				System.out.println("iam good");
			}

		}

