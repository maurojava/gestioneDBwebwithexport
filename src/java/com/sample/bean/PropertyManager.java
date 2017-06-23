package com.sample.bean;


import java.util.ArrayList;
import java.util.List;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;


import com.sample.model.Person;



@ViewScoped
@ManagedBean(name="manager")
public class PropertyManager {


	ArrayList<Person>  cacheList  = new ArrayList ();

	private String name;
	private String surname;
	private int age;
	private String city;

	public void save() {

		Person p = new Person(name,surname,age,city);
		System.out.println(p);
		cacheList.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name"+name);
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCacheList(ArrayList<Person> cacheList) {
		this.cacheList = cacheList;
	}

	public void clear() {
		cacheList.clear();
	}
	public List getCacheList() {
		return cacheList;
	}

	public void postProcessXLS(Object document) {
		HSSFWorkbook wb = (HSSFWorkbook) document;
		HSSFSheet sheet = wb.getSheetAt(0);		
		CellStyle style = wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());

		for (Row row : sheet) {
			for (Cell cell : row) {
				cell.setCellValue(cell.getStringCellValue().toUpperCase());
				cell.setCellStyle(style);
			}
		}
	}

}
