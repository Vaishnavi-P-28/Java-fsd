package Dynamic;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		@Column
		private String name;
		public int getId() {
		return id;
		}
		public void setId(int id) {
		this.id = id;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name=name;

}
}	
