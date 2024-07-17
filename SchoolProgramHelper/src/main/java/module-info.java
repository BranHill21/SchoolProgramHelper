module SchoolProgramHelper.SchoolProgramHelper {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;

    opens SchoolProgramHelper.SchoolProgramHelper to javafx.fxml;
    exports SchoolProgramHelper.SchoolProgramHelper;
}
