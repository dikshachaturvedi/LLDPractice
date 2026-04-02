package Splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MincashFlow implements Settlement{

    HashMap<User , Double> netBalance = new HashMap<>();

    public void simplify(Map<User, Map<User, Double>> map){
        for (Map.Entry<User, Map<User, Double>> entry : map.entrySet()) {

            User from = entry.getKey();

            for (Map.Entry<User, Double> inner : entry.getValue().entrySet()) {

                User to = inner.getKey();
                double amount = inner.getValue();

                netBalance.put(from, netBalance.get(from) - amount);
                netBalance.put(to, netBalance.get(to) + amount);
            }
        }



    }


//    public List<Transaction> simplifyDebt(Map<User, Double> netBalance) {
//
//        List<Transaction> result = new ArrayList<>();
//
//        while (true) {
//
//            User creditor = null;
//            User debtor = null;
//
//            double maxCredit = 0;
//            double maxDebit = 0;
//
//            // 1️⃣ find max creditor & max debtor
//            for (Map.Entry<User, Double> entry : netBalance.entrySet()) {
//
//                double amount = entry.getValue();
//
//                if (amount > maxCredit) {
//                    maxCredit = amount;
//                    creditor = entry.getKey();
//                }
//
//                if (amount < maxDebit) {
//                    maxDebit = amount;
//                    debtor = entry.getKey();
//                }
//            }
//
//            // 2️⃣ termination
//            if (creditor == null || debtor == null) break;
//
//            // 3️⃣ settlement amount
//            double settleAmount = Math.min(maxCredit, -maxDebit);
//
//            // 4️⃣ record transaction
//            result.add(new Transaction(debtor, creditor, settleAmount));
//
//            // 5️⃣ update balances
//            netBalance.put(creditor, maxCredit - settleAmount);
//            netBalance.put(debtor, maxDebit + settleAmount);
//        }
//
//        return result;
//    }

//
//
//    import java.util.*;
//
//    class Solution {
//
//        static class Person {
//            int id;
//            int amount;
//            Person(int id, int amount) {
//                this.id = id;
//                this.amount = amount;
//            }
//        }
//
//        public static void minimizeCashFlow(int[][] transactions, int n) {
//
//            int[] net = new int[n];
//
//            // Calculate net amount for each person
//            for (int[] t : transactions) {
//                int from = t[0];
//                int to = t[1];
//                int amount = t[2];
//
//                net[from] -= amount;
//                net[to] += amount;
//            }
//
//            // Max heap for creditors
//            PriorityQueue<Person> creditors =
//                    new PriorityQueue<>((a, b) -> b.amount - a.amount);
//
//            // Max heap for debtors
//            PriorityQueue<Person> debtors =
//                    new PriorityQueue<>((a, b) -> a.amount - b.amount); // more negative first
//
//            for (int i = 0; i < n; i++) {
//                if (net[i] > 0) creditors.add(new Person(i, net[i]));
//                else if (net[i] < 0) debtors.add(new Person(i, net[i]));
//            }
//
//            // Settle transactions
//            while (!creditors.isEmpty() && !debtors.isEmpty()) {
//
//                Person cred = creditors.poll();
//                Person debt = debtors.poll();
//
//                int settleAmount = Math.min(cred.amount, -debt.amount);
//
//                System.out.println(
//                        "Person " + debt.id + " pays " +
//                                settleAmount + " to Person " + cred.id
//                );
//
//                cred.amount -= settleAmount;
//                debt.amount += settleAmount;
//
//                if (cred.amount > 0) creditors.add(cred);
//                if (debt.amount < 0) debtors.add(debt);
//            }
//        }
//
//        public static void main(String[] args) {
//
//            int n = 3;
//
//            // from, to, amount
//            int[][] transactions = {
//                    {0, 1, 1000},
//                    {0, 2, 2000},
//                    {1, 2, 500}
//            };
//
//            minimizeCashFlow(transactions, n);
//        }
//    }
}
