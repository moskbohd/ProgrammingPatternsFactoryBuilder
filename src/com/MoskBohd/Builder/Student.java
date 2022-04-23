package com.MoskBohd.Builder;

import java.time.LocalDate;

public class Student extends Person {

    private Person studentPersonalInfo;
    private LocalDate dateOfAdmission;
    private LocalDate dateOfGraduation;
    private boolean isFullTimeEducation;
    private String codeOfStudentTicket;
    private String nameOfUniversity;
    private int postcodeOfUniversity;
    private String postAddressOfUniversity;
    private String addressOfUniversity;
    private String nameOfFaculty;
    private int codeOfFaculty;
    private String numberOfStudentGroup;
    private Person groupLeaderPersonalInfo;
    private int amountOfSubjectsPerSemester;
    private int amountOfExamPerSemester;
    private String studentAddressOfPermanentResidence;
    private String studentCurrentAddressOfResidence;
    private String studentPhoneNumber;
    private int studentCourseNumber;
    private boolean isBudget;
    private boolean hasStipend;
    private byte bloodType;
    private boolean rhesusBloodFactor;
    private String studentEthnicity;
    private String id;

    public Student(String firstName, String lastName, String patronymic, LocalDate dateOFBirth) {
        super(firstName, lastName, patronymic, dateOFBirth);
    }

    public Student() {
    }

    // Getters and Setters

    public Person getStudentPersonalInfo() {
        return studentPersonalInfo;
    }

    public void setStudentPersonalInfo(Person studentPersonalInfo) {
        this.studentPersonalInfo = studentPersonalInfo;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public LocalDate getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(LocalDate dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public boolean isFullTimeEducation() {
        return isFullTimeEducation;
    }

    public void setFullTimeEducation(boolean fullTimeEducation) {
        isFullTimeEducation = fullTimeEducation;
    }

    public String getCodeOfStudentTicket() {
        return codeOfStudentTicket;
    }

    public void setCodeOfStudentTicket(String codeOfStudentTicket) {
        this.codeOfStudentTicket = codeOfStudentTicket;
    }

    public void setNumberOfStudentGroup(String numberOfStudentGroup) {
        this.numberOfStudentGroup = numberOfStudentGroup;
    }

    public int getAmountOfSubjectsPerSemester() {
        return amountOfSubjectsPerSemester;
    }

    public void setAmountOfSubjectsPerSemester(int amountOfSubjectsPerSemester) {
        this.amountOfSubjectsPerSemester = amountOfSubjectsPerSemester;
    }

    public boolean isHasStipend() {
        return hasStipend;
    }

    public void setHasStipend(boolean hasStipend) {
        this.hasStipend = hasStipend;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public int getPostcodeOfUniversity() {
        return postcodeOfUniversity;
    }

    public void setPostcodeOfUniversity(int postcodeOfUniversity) {
        this.postcodeOfUniversity = postcodeOfUniversity;
    }

    public String getPostAddressOfUniversity() {
        return postAddressOfUniversity;
    }

    public void setPostAddressOfUniversity(String postAddressOfUniversity) {
        this.postAddressOfUniversity = postAddressOfUniversity;
    }

    public String getAddressOfUniversity() {
        return addressOfUniversity;
    }

    public void setAddressOfUniversity(String addressOfUniversity) {
        this.addressOfUniversity = addressOfUniversity;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public int getCodeOfFaculty() {
        return codeOfFaculty;
    }

    public void setCodeOfFaculty(int codeOfFaculty) {
        this.codeOfFaculty = codeOfFaculty;
    }

    public String getNumberOfStudentGroup() {
        return numberOfStudentGroup;
    }

    public void setNumberOfStudentGroup(int numberOfStudentGroup) {
        this.numberOfStudentGroup = String.valueOf(numberOfStudentGroup);
    }

    public Person getGroupLeaderPersonalInfo() {
        return groupLeaderPersonalInfo;
    }

    public void setGroupLeaderPersonalInfo(Person groupLeaderPersonalInfo) {
        this.groupLeaderPersonalInfo = groupLeaderPersonalInfo;
    }

    public int getAmountOfSubjects() {
        return amountOfSubjectsPerSemester;
    }

    public void setAmountOfSubjects(int amountOfSubjects) {
        this.amountOfSubjectsPerSemester = amountOfSubjects;
    }

    public int getAmountOfExamPerSemester() {
        return amountOfExamPerSemester;
    }

    public void setAmountOfExamPerSemester(int amountOfExamPerSemester) {
        this.amountOfExamPerSemester = amountOfExamPerSemester;
    }

    public String getStudentAddressOfPermanentResidence() {
        return studentAddressOfPermanentResidence;
    }

    public void setStudentAddressOfPermanentResidence(String studentAddressOfPermanentResidence) {
        this.studentAddressOfPermanentResidence = studentAddressOfPermanentResidence;
    }

    public String getStudentCurrentAddressOfResidence() {
        return studentCurrentAddressOfResidence;
    }

    public void setStudentCurrentAddressOfResidence(String studentCurrentAddressOfResidence) {
        this.studentCurrentAddressOfResidence = studentCurrentAddressOfResidence;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public int getStudentCourseNumber() {
        return studentCourseNumber;
    }

    public void setStudentCourseNumber(int studentCourseNumber) {
        this.studentCourseNumber = studentCourseNumber;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public byte getBloodType() {
        return bloodType;
    }

    public void setBloodType(byte bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isRhesusBloodFactor() {
        return rhesusBloodFactor;
    }

    public void setRhesusBloodFactor(boolean rhesusBloodFactor) {
        this.rhesusBloodFactor = rhesusBloodFactor;
    }

    public String getStudentEthnicity() {
        return studentEthnicity;
    }

    public void setStudentEthnicity(String studentEthnicity) {
        this.studentEthnicity = studentEthnicity;
    }


    // builder
    public static class Builder {
        private Student student;

        public Builder(){
            student = new Student();
        }
        public Builder withId(String id){
            student.id = id;
            return this;
        }
        public Builder withFirstName(String firstName){
            student.setFirstName(firstName);
            return this;
        }
        public Builder withLastName(String lastName){
            student.setFirstName(lastName);
            return this;
        }
        public Builder withPatronymic(String patronymic){
            student.setPatronymic(patronymic);
            return this;
        }
        public Builder withDateOfAdmission(LocalDate dateOfAdmission){
            student.setDateOfAdmission(dateOfAdmission);
            return this;
        }
        public Builder withDateOfGraduation(LocalDate dateOfGraduation){
            student.setDateOfGraduation(dateOfGraduation);
            return this;
        }
        public Builder withIsFullTimeEducation(boolean isFullTimeEducation){
            student.setFullTimeEducation(isFullTimeEducation);
            return this;
        }
        public Builder withCodeOfStudentTicket(String codeOfStudentTicket){
            student.setCodeOfStudentTicket(codeOfStudentTicket);
            return this;
        }
        public Builder withNameOfUniversity(String nameOfUniversity){
            student.setNameOfUniversity(nameOfUniversity);
            return this;
        }
        public Builder withPostcodeOfUniversity(int postcodeOfUniversity){
            student.setPostcodeOfUniversity(postcodeOfUniversity);
            return this;
        }
        public Builder withPostAddressOfUniversity(String postAddressOfUniversity){
            student.setPostAddressOfUniversity(postAddressOfUniversity);
            return this;
        }
        public Builder withAddressOfUniversity(String addressOfUniversity){
            student.setAddressOfUniversity(addressOfUniversity);
            return this;
        }
        public Builder withNameOfFaculty(String nameOfFaculty){
            student.setNameOfFaculty(nameOfFaculty);
            return this;
        }
        public Builder withCodeOfFaculty(int codeOfFaculty){
            student.setCodeOfFaculty(codeOfFaculty);
            return this;
        }
        public Builder withNumberOfStudentGroup(String numberOfStudentGroup){
            student.setNumberOfStudentGroup(numberOfStudentGroup);
            return this;
        }
        public Builder withGroupLeaderPersonalInfo(Person groupLeaderPersonalInfo){
            student.setGroupLeaderPersonalInfo(groupLeaderPersonalInfo);
            return this;
        }
        public Builder withAmountOfSubjects(int amountOfSubjects){
            student.setAmountOfSubjects(amountOfSubjects);
            return this;
        }
        public Builder withAmountOfExamPerSemester(int amountOfExamPerSemester){
            student.setAmountOfExamPerSemester(amountOfExamPerSemester);
            return this;
        }
        public Builder withStudentAddressOfPermanentResidence(String studentAddressOfPermanentResidence){
            student.setStudentAddressOfPermanentResidence(studentAddressOfPermanentResidence);
            return this;
        }
        public Builder withStudentCurrentAddressOfResidence(String studentCurrentAddressOfResidence){
            student.setStudentCurrentAddressOfResidence(studentCurrentAddressOfResidence);
            return this;
        }
        public Builder withStudentPhoneNumber(String studentPhoneNumber){
            student.setStudentPhoneNumber(studentPhoneNumber);
            return this;
        }
        public Builder withStudentCourseNumber(int studentCourseNumber){
            student.setStudentCourseNumber(studentCourseNumber);
            return this;
        }
        public Builder withBudget(boolean isBudget){
            student.setBudget(isBudget);
            return this;
        }
        public Builder withHasStipend(boolean hasStipend){
            student.setHasStipend(hasStipend);
            return this;
        }
        public Builder withBloodType(byte bloodType){
            student.setBloodType(bloodType);
            return this;
        }
        public Builder withRhesusBloodFactor(boolean rhesusBloodFactor){
            student.setRhesusBloodFactor(rhesusBloodFactor);
            return this;
        }
        public Builder withStudentEthnicity(String studentEthnicity){
            student.setStudentEthnicity(studentEthnicity);
            return this;
        }
        public Student build(){
            return student;
        }
    }
}
