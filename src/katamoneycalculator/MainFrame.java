package katamoneycalculator;

import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import katamoneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame{

    public MainFrame() {
        setTitle("Money calculator");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setMenuBar(menuBar());
        setLayout(new FlowLayout());
        add(moneyDisplay());
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(operationMenu());
        menuBar.add(operationMenu());
        return menuBar;
    }

    private Menu operationMenu() {
        Menu menu = new Menu("Operation");
        menu.add(calculateMenuItem());
        menu.add(calculateMenuItem());
        menu.add(calculateMenuItem());
        menu.add(calculateMenuItem());
        return menu;
    }

    private MenuItem calculateMenuItem() {
        MenuItem menuItem = new MenuItem("calculator");
        menuItem.addActionListener(executeCalculator());
        return menuItem;
    }

    private ActionListener executeCalculator() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Execute ....");
            }
        };
    }
    private JPanel moneyDisplay(){
        SwingMoneyDisplay panel = new  SwingMoneyDisplay();
        return panel;
    }
}
