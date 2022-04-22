package edu.vn.shop.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;


public class ProductDto {
	
	private Long productId;
	private String name;
	private int quantity;
	private double unitPrice;
	private String image;
	private MultipartFile imageFile;
	private String description;
	private double discount;
	private Date enteredDate;
	private short status;
	private Long categoryId;
	private boolean isEdit;
	
	public ProductDto(String name, int quantity, double unitPrice, String image,
			MultipartFile imageFile, String description, double discount, Date enteredDate, short status,
			Long categoryId, boolean isEdit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.image = image;
		this.imageFile = imageFile;
		this.description = description;
		this.discount = discount;
		this.enteredDate = enteredDate;
		this.status = status;
		this.categoryId = categoryId;
		this.isEdit = isEdit;
	}

	public ProductDto() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public boolean isEdit() {
		return isEdit;
	}

	public void setEdit(boolean isEdit) {
		this.isEdit = isEdit;
	}
	
	
	
	
}

//category_id, description, discount, entered_date, image, name, quantity, status, unit_price

//Dto sẽ ánh xạ với các trường dữ liệu trên form. 