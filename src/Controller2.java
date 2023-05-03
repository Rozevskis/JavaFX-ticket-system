import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;

public class Controller implements Initializable {

    @FXML
    private TableView<Employee> Table;

    @FXML
    private TableColumn<Employee, String> Vards;

    @FXML
    private TableColumn<Employee, String> Uzvards;

    @FXML
    private TableColumn<Employee, String> Vecums;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Vards.setCellValueFactory(new PropertyValueFactory<Employee, String>("vards"));
        Uzvards.setCellValueFactory(new PropertyValueFactory<Employee, String>("uzvards"));
        Vecums.setCellValueFactory(new PropertyValueFactory<Employee, String>("vecums"));

        Employee employee1 = new Employee("Artis", "Botters", "23"),
                employee2 = new Employee("Edgars", "Rauls", "23"),
                employee3 = new Employee("aaaa", "deddee", "23");

        Vector<Employee> vec = new Vector<>();
        vec.add(employee1);
        vec.add(employee2);
        vec.add(employee3);
        for (int i = 0; i < vec.size(); i++) {
            Table.getItems().add(vec.get(i));

        }
    }
}
