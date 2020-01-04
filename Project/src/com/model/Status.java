package com.model;

public class Status {
		private String id;
		private String name;
		private String gender;
		private String dateofbirth;
		private String fulltimeEmployee;
		
		
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getDateofbirth() {
			return dateofbirth;
		}


		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}


		public String getFulltimeEmployee() {
			return fulltimeEmployee;
		}


		public void setFulltimeEmployee(String fulltimeEmployee) {
			this.fulltimeEmployee = fulltimeEmployee;
		}


		public Status(String id, String name, String gender, String dateofbirth, String fulltimeEmployee) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.dateofbirth = dateofbirth;
			this.fulltimeEmployee = fulltimeEmployee;
		}


		public Status() {
			super();
			// TODO Auto-generated constructor stub
		} 
		
		
}
