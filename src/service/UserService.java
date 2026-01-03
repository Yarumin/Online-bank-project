package service;

import model.Admin;
import model.Customer;
import model.Employee;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static List<Admin> admins = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();


    public static User login(String nationalId, String password){

        User u = findUserByNationalId(nationalId);

        if(u == null) return null;

        if(u.getPassword().equals(password))
            return u;

        return null;
    }


    public static User findUserByNationalId(String id){

        for(Admin a : admins)
            if(a.getNationalId().equals(id))
                return a;

        for(Employee e : employees)
            if(e.getNationalId().equals(id))
                return e;

        for(Customer c : customers)
            if(c.getNationalId().equals(id))
                return c;

        return null;
    }


    public static boolean addAdmin(Admin admin){
        admins.add(admin);
        return true;
    }


    public static boolean addEmployee(Employee employee){

        if(findUserByNationalId(employee.getNationalId()) != null)
            return false;

        for(Employee e : employees)
            if(e.getEmployeeId().equals(employee.getEmployeeId()))
                return false;

        employees.add(employee);
        return true;
    }


    public static boolean removeEmployee(String empId){

        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getEmployeeId().equals(empId)){
                employees.remove(i);
                return true;
            }
        }

        return false;
    }


    public static boolean addCustomer(Customer c){

        if(findUserByNationalId(c.getNationalId()) != null)
            return false;

        customers.add(c);
        return true;
    }


    public static boolean removeCustomer(String nationalId){

        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getNationalId().equals(nationalId)){
                customers.remove(i);
                return true;
            }
        }

        return false;
    }


    public static Customer findCustomer(String nationalId){

        for(Customer c : customers)
            if(c.getNationalId().equals(nationalId))
                return c;

        return null;
    }


    public static List<Customer> getCustomers(){
        return customers;
    }

    public static List<Employee> getEmployees(){
        return employees;
    }
}
