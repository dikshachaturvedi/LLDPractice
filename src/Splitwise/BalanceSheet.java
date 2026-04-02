package Splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceSheet {
    Map<User, Map<User, Double>> balances = new HashMap<>(); // konse user ko kisko dena h or kitna amount


    public Map<User, Map<User, Double>>  sheet(User from , User to , double amount){

balances.computeIfAbsent(from , k -> new HashMap<>())
        .put(to, balances.get(from).getOrDefault(to, 0.0) + amount);


        return  balances ;
    }

    public Map<User, Map<User, Double>> getBalances() {
        return balances;
    }
}
