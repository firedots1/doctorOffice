public class DoctorOffice {
    public static void main(String[] args) {

        String patientName = "Zhi Cheng";
        String hasInsurance = "false";
        double patientCopayDollar = 24.99;
        float temp = 102.2f;
        float numVisits = 5.02f;
        int Month = 12;
        int Day = 11;
        int Year = 2021;
        int phoneNumberAreaCode = 301;
        int phoneNumber = 5551235;

        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: "+hasInsurance);
        System.out.println("Body temperature: " + temp + "F");
        System.out.println("Patient's Copay Amount: " + "$" + patientCopayDollar);
        System.out.println("Next Appointment Date: " + Year + "-" + Month + "-" + Day);
        System.out.println("Contact Number: " +"(" + phoneNumberAreaCode + ")" + phoneNumber);


    }
}
