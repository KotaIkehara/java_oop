package exercise;
public class ExecManager {
	public static void main(String[] args) {
		Manager m = new Manager(110, "森下樹", 32, "プロジェクトマネージャー");
		
		System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getAge()+"\t"+m.getTitle());
	}
}