package Service.Impl;

import DAO.AllDAO;
import DAO.Impl.AllDAOImpl;
import Service.CalculationService;

public class CalculationServiceImpl implements CalculationService {
    private AllDAO allDAO;

    public CalculationServiceImpl (AllDAOImpl allDAO){
        this.allDAO=allDAO;
    }

    @Override
    public void summa(int firstNumber, char symbol, int secondNumber) {
        allDAO.summa(firstNumber,symbol,secondNumber);
    }


}
