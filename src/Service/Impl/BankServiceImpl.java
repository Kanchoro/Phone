package Service.Impl;

import DAO.AllDAO;
import Models.Bank;
import Service.BankService;

public class BankServiceImpl implements BankService {
    private final AllDAO allDAO;

    public BankServiceImpl(AllDAO allDAO) {
        this.allDAO = allDAO;
    }

    @Override
    public void addMoney(Bank money) {
        allDAO.addMoney(money);
    }

    @Override
    public void getAllMoney() {
        allDAO.getAllMoney();
    }
}
