/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionapp;

import javax.swing.JOptionPane;
/**
 *
 * @author bryanshintani
 */
public class ExceptionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // ask user to enter class size
            int classSize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter class size"));
            // ask user how many groups to break the class into
            int groups = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of groups"));
            // calculate the # of students per group
        
            int students = classSize / groups;
            // display the results to the user
            String summary = "Group size summary\n\n";

            summary += "Class size: " + classSize + "\n";
            summary += "Groups Size: " + groups + "\n";
            summary += "Number of Students: " + students + "\n";

            JOptionPane.showMessageDialog(null, summary);
        } catch(ArithmeticException arEx) {
            
            JOptionPane.showMessageDialog(null, "There was an error processing your request\n\n" + 
                    arEx.getMessage() +
                    "\n\nThe value for Group Size is invalid. Please enter an integer greater than 0.");
        } catch(NumberFormatException nfEx) {
            
            JOptionPane.showMessageDialog(null, "There was an error processing your request\n\n" +
                    nfEx.getMessage() +
                    "\n\nThe value you entered has to be a numeric value.");
        } catch(Exception ex) {
            
            JOptionPane.showMessageDialog(null, "There was an error processing your request\n\n" +
                    ex.getMessage());
        }
    }
}
