package task_3_2.EqFactory;

import task_3_2.Equations.IEquation;

public abstract class EquationFactory {
    protected boolean detailedOutput;
    public abstract IEquation createEquation(String[] coefficients);
}
