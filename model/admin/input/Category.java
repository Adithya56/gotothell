package eStoreProduct.model.admin.input;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slam_ProductCategories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prct_id")
    private Integer prct_id;

    @Column(name = "prct_title")
    private String prct_title;

    @Column(name = "prct_desc")
    private String prct_desc;

    // Constructors, getters, and setters
    // ...

    public Category() {
        // Default constructor
    }

   
	public Category(Integer prct_id, String prct_title, String prct_desc) {
		super();
		this.prct_id = prct_id;
		this.prct_title = prct_title;
		this.prct_desc = prct_desc;
	}


	public Integer getPrct_id() {
		return prct_id;
	}

	public void setPrct_id(Integer prct_id) {
		this.prct_id = prct_id;
	}

	public String getPrct_title() {
		return prct_title;
	}

	public void setPrct_title(String prct_title) {
		this.prct_title = prct_title;
	}

	public String getPrct_desc() {
		return prct_desc;
	}

	public void setPrct_desc(String prct_desc) {
		this.prct_desc = prct_desc;
	}

   }
