public class Student {
    private String name;
    private String ID;
    private String program;
    private String department;
    private String FatherName;
    private String ContactNo;
    private String NIC;
    private String YearOfJoining;
    private String course;
    private String FatherContact;

    public Student(String name, String ID, String FatherName, String FatherContact, String ContactNo, String program, String department,String YearOfJoining,String select){
        this.name=name;
        this.ID=ID;
        this.FatherName=FatherName;
        this.FatherContact=FatherContact;
        this.ContactNo=ContactNo;
        this.program=program;
        this.department=department;
        this.YearOfJoining=YearOfJoining;
        this.course=select;






    }

    public String getFatherContact() {
        return FatherContact;
    }

    public void setFatherContact(String fatherContact) {
        FatherContact = fatherContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {


        this.ID = ID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getYearOfJoining() {
        return YearOfJoining;
    }

    public void setYearOfJoining(String yearOfJoining) {
        YearOfJoining = yearOfJoining;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    @Override
    public String toString() {
        return "\n Name: " + name + "\n" +"ID: "+ ID + "\n  Father's Name: "+FatherName+"\n Father's Contact No: "+FatherContact+"" +
                "\n Contact No: " +ContactNo+"\nProgram: "+program+"\n Department: " + department+"\n Year Of Joining: "+YearOfJoining+"\n COURSES: "+course ;
    }

}
