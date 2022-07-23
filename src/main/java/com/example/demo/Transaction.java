package com.example.demo;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static com.example.demo.BankApplication.myAccounts;
import static com.example.demo.BankApplication.noAccounts;


public class Transaction {
    private JButton TransactionJButton;

    // JButton to display account
    private JButton DisplayJButton;

    // JLabel and JTextArea to display account details
    private JLabel displayJLabel;
    private static JTextArea displayJTextArea;
    private JPanel inputDetailJPanel;

    // JLabel and JTextField for account name
    private JLabel NameJLabel;
    private JTextField NameJTextField;

    // JLabel and JTextField for account number
    private JLabel AccountnumJLabel;
    private JTextField AccountnumJTextField;

    // JLabel and JTextField for balance
    private JLabel BalanceJLabel;
    private JTextField BalanceJTextField;

    // JLabel and JTextField for withdraw
    private JLabel DepositJLabel;
    private JTextField DepositJTextField;

    // JLabel and JTextField for Withdraw
    private JLabel WithdrawJLabel;
    private JTextField WithdrawJTextField;

    // JButton to create account
    private JButton CreateAccountJButton;

    // JButton to delete account
    private JButton DeleteAccountJButton;


    private void TransactionJButtonActionPerformed(ActionEvent event) {
        displayJTextArea.setText("");
        if (noAccounts == 0) {
            displayJTextArea.setText("No Accounts currently created");
        } else {
            int Accountnum = Integer.parseInt(this.AccountnumJTextField.getText());
            int Deposit = Integer.parseInt(this.DepositJTextField.getText());
            int Withdraw = Integer.parseInt(this.WithdrawJTextField.getText());

            for(int i = 0; i < noAccounts; ++i) {
                if (myAccounts[i].getaccountnum() == Accountnum && Deposit > 0) {
                    myAccounts[i].setbalance(myAccounts[i].getbalance() + Deposit);
                    displayJTextArea.setText(myAccounts[i].getaccountname() + " " + myAccounts[i].getaccountnum() + " " + myAccounts[i].getbalance());
                }

                if (myAccounts[i].getaccountnum() == Accountnum && Withdraw > 0) {
                    myAccounts[i].setbalance(myAccounts[i].getbalance() - Withdraw);
                    displayJTextArea.setText(myAccounts[i].getaccountname() + " " + myAccounts[i].getaccountnum() + " " + myAccounts[i].getbalance());
                }
            }
        }

        this.NameJTextField.setText(" ");
        this.AccountnumJTextField.setText("0");
        this.BalanceJTextField.setText("0");
        this.DepositJTextField.setText("0");
        this.WithdrawJTextField.setText("0");
    }

}
