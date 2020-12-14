package com.company;

import java.util.Scanner;

    public class EmailApp<password> {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private String email;
        private int mailboxCapacity = 500;
        private String alternateEmail;
        private int defaultPasswordLength = 10;
        private String companySuffix = "blablacompany.com";

        public EmailApp(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = this.setDepartment();
            this.password = this.randomPassword(this.defaultPasswordLength);
            String var10001 = firstName.toLowerCase();
            this.email = var10001 + "." + lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
        }

        private String setDepartment() {
            System.out.println("New worker: " + this.firstName + "Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) {
                return "Sales";
            } else if (depChoice == 2) {
                return "Dev";
            } else {
                return depChoice == 3 ? "Accounting" : "";
            }
        }

        private String randomPassword(int length) {
            String passwordSet = "ABC123";
            char[] password = new char[length];

            for(int i = 0; i < length; ++i) {
                int rand = (int)(Math.random() * (double)passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }

            return new String(password);
        }

        public void setMailboxCapacity(int capacity) {
            this.mailboxCapacity = capacity;
        }

        public void setAlternateEmail(String altEmail) {
            this.alternateEmail = altEmail;
        }

        public void changePassword(String password) {
            this.password = password;
        }

        public int getMailboxCapacity() {
            return this.mailboxCapacity;
        }

        public String getAlternateEmail() {
            return this.alternateEmail;
        }

        public String getPassword() {
            return this.password;
        }

        public String showInfo() {
            return "DISPLAY NAME: " + this.firstName + " " + this.lastName + "\nCOMPANY EMAIL: " + this.email + "\nMAILBOX CAPACITY: " + this.mailboxCapacity + "mb";
        }
    }

