//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialAccount=100; //начальный счет
        int summa =1100; //сумма пополнения
        int bonus;
        if ((initialAccount+summa)>1000) {
            bonus = summa / 100;
        } else { bonus=0;
            }
        System.out.println("Бонус = "+bonus);
        System.out.println("Сумма на счете = "+ (initialAccount+summa+bonus));
        }
    }
