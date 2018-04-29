package com.inosovskyi.app.homework.lesson13;

public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        setCompany(company);
    }

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {
        if (verifyCompany(company)) {
            this.company = company;
        }
    }

    @Override
    public String toString() {
        return "WhiteCollar{" +
                "company='" + company + '\'' +
                "} " + super.toString();
    }

    private boolean verifyCompany(String company) {
        if (company.toLowerCase().matches("[a-zA-Z0-9\\s\\-,]+")) {
            return true;
        } else {
            System.out.println("Company name is invalid");
            return false;
        }
    }
}

