package fruits;


	import java.util.ArrayList;
	import java.util.List;

	public class Main {

		
		public static void main(String[] args) {
			
			List<Fruit> fruits = new ArrayList<>();

			fruits.add(new Fruit("orange", 20));
			fruits.add(new Fruit("banana", 40));
			
			fruits.add(new Fruit("apple", 15));
			
			Fruit fruit = new Fruit("apple", 15);
			
			System.out.println(fruit.getName().hashCode());
			
//			System.out.println(fruits.size());
//			System.out.println(fruits.isEmpty());
//			fruits.add(2, new Fruit("potato", 1000));
//			
//			System.out.println(fruits);
//			
//			System.out.println(fruits.set(1, new Fruit("some", 90000)));
//			
//			System.out.println(fruits);
			
			for (Fruit f : fruits) {
				
//				if(f.getName().equals(fruit.getName()) && 
//						f.getPrice() == fruit.getPrice()){
//					System.out.println("exist");
//				}
				if(f.equals(fruit)){
					System.out.println("exsist");
				}
				
				
			}
			
			
			
			
//			ArrayList arrayList = new ArrayList();
//			
//			
//			List list2 = new LinkedList();
//			
//			LinkedList linkedList = new LinkedList();
			
//			List<String> list = new ArrayList();
			
//			list.add(1);
//			list.add("asdasd");
//			list.add(12.423);
//			list.add(new Main());
//			list.get(0).
			
			
			
			
		}
		
	}
	

