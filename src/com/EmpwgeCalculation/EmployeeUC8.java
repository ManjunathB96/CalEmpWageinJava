package com.EmpwgeCalculation;

public class EmployeeUC8 {


        public int wageCalculator(int empHrs, int empRatePerHr, int numOfWorkingDays) {
            int empWage = 0;
            int totalWage = 0;

            for (int day = 0; day <= numOfWorkingDays; day++) {

                empWage = empHrs * empRatePerHr;
                totalWage += empWage;

            }

            System.out.println("Total Wage employee is:" + totalWage);

            return totalWage;
        }


        public static void main(String[] args) {

            EmployeeUC8 company1 = new EmployeeUC8();

            EmployeeUC8 company2 = new EmployeeUC8();

            company1.wageCalculator(8,500,22);
            company2.wageCalculator(7,800,26);


        }


    }


