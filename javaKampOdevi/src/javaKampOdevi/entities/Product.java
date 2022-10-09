package javaKampOdevi.entities;

public class Product {

	private int id;
	private String courseName;
	private String categoryName;
	private double coursePrice;
	
	public Product(int id, String courseName, String categoryName, double coursePrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.categoryName = categoryName;
		this.coursePrice = coursePrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
}
