package SwiftMath.Project.GUI.System.AppSystem;

import SwiftMath.Project.GUI.System.ShapeSystem.CircleGUI;
import SwiftMath.Project.Resources.UI.Assets.Components.AppColors;
import SwiftMath.Project.Resources.UI.Assets.Components.AppButton;
import SwiftMath.Project.GUI.System.ShapeSystem.TriangleAreaGUI;
import SwiftMath.Project.GUI.System.ShapeSystem.TriTypePerimeterGUI;
import SwiftMath.Project.GUI.System.ShapeSystem.QuadTypeGUI;
import SwiftMath.Project.Resources.Shape.GraphicsManager.ShapePanel;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:15 AM
 */
public class SideGUI extends JPanel implements ActionListener {


    public static final JButton CalculatorButton = new AppButton();
    public static final AppButton CircleButton = new AppButton();
    public static final AppButton QuadButton = new AppButton();
    public static final AppButton Trianglebutton = new AppButton();
    public static final JPanel formulaPanel = new JPanel();
    public static final JCheckBox TriangleRbtn = new JCheckBox("Triangle Area/Pm.");
    public static final JCheckBox CircleRbtn= new JCheckBox("Circle");
    public static final JCheckBox OpenQuad = new JCheckBox("Quad Calculator");
    public static final JCheckBox TriPerimeterTriType = new JCheckBox("Triangle Pm./Type");
    public static final Font SidePanelFont = new Font("Segoe UI", Font.BOLD, 22);


    public SideGUI() {
        this.setBackground(AppColors.Variety_Misty_Gray);
        this.setPreferredSize(new Dimension(225, 800));
        this.setLayout(new FlowLayout());
        setSquareButton();
    }

    public void setSquareButton(){

        QuadButton.setPreferredSize(new Dimension(150,50));
        QuadButton.setBackground(AppColors.Variety_Pink);
        QuadButton.setText("QUAD");
        QuadButton.setFont(SidePanelFont);
        QuadButton.addActionListener(this);
        QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(QuadButton);
        setCircleButton();
        setTriangleButton();
        setCalulatorFrame();
    }

    public void setTriangleButton(){

        Trianglebutton.setPreferredSize(new Dimension(150,50));
        Trianglebutton.setBackground(AppColors.Variety_Pink);
        Trianglebutton.setText("TRIANGLE");
        Trianglebutton.setFont(SidePanelFont);
        Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        Trianglebutton.addActionListener(this);
        this.add(Trianglebutton);
    }

    public void setCircleButton(){

        CircleButton.setPreferredSize(new Dimension(150,50));
        CircleButton.setBackground(AppColors.Variety_Pink);
        CircleButton.setText("CIRCLE");
        CircleButton.setFont(SidePanelFont);
        CircleButton.addActionListener(this);
        CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(CircleButton);
    }

    public void setCalulatorFrame(){
        CalculatorButton.setPreferredSize(new Dimension(150,50));
        CalculatorButton.setBackground(AppColors.Variety_Deep_Magenta);
        CalculatorButton.setFont(SidePanelFont);
        CalculatorButton.setForeground(AppColors.Variety_WHITE);
        CalculatorButton.setFocusable(false);
        CalculatorButton.addActionListener(this);
        CalculatorButton.setText("Calculator");
        this.add(CalculatorButton);
        setFormulaPanel();
    }

    public void setFormulaPanel(){
        formulaPanel.setBackground(AppColors.Variety_Bottle_Green);
        formulaPanel.setPreferredSize(new Dimension(200, 225));
        formulaPanel.setLayout(new FlowLayout());
        formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
        this.add(formulaPanel);
        setOptionsRadioBtn();

    }

    public void setOptionsRadioBtn(){
        TriangleRbtn.setPreferredSize(new Dimension(150,50));
        TriangleRbtn.setBackground(AppColors.Variety_BLACK);
        TriangleRbtn.setForeground(AppColors.Variety_WHITE);
        TriangleRbtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        TriangleRbtn.setFocusable(false);
        TriangleRbtn.setContentAreaFilled(false);
        TriangleRbtn.addActionListener(this);
        formulaPanel.add(TriangleRbtn);

        CircleRbtn.setPreferredSize(new Dimension(150,50));
        CircleRbtn.setBackground(AppColors.Variety_BLACK);
        CircleRbtn.setForeground(AppColors.Variety_WHITE);
        CircleRbtn.setFont(SidePanelFont);
        CircleRbtn.setFocusable(false);
        CircleRbtn.setContentAreaFilled(false);
        CircleRbtn.addActionListener(this);
        formulaPanel.add(CircleRbtn);
        setOpenQuadCalculator();
        setTriAnotherButton();

    }

    public void setOpenQuadCalculator() {
        OpenQuad.setPreferredSize(new Dimension(150,50));
        OpenQuad.setBackground(AppColors.Variety_WHITE);
        OpenQuad.setForeground(new Color(255, 255, 255));
        OpenQuad.setFont(new Font("Segoe UI", Font.BOLD, 16));
        OpenQuad.setFocusable(false);
        OpenQuad.setContentAreaFilled(false);
        OpenQuad.addActionListener(this);
        formulaPanel.add(OpenQuad);

    }

    public void setTriAnotherButton() {
        TriPerimeterTriType.setPreferredSize(new Dimension(150,50));
        TriPerimeterTriType.setBackground(AppColors.Variety_WHITE);
        TriPerimeterTriType.setForeground(new Color(255, 255, 255));
        TriPerimeterTriType.setFont(new Font("Segoe UI", Font.BOLD, 13));
        TriPerimeterTriType.setFocusable(false);
        TriPerimeterTriType.setContentAreaFilled(false);
        TriPerimeterTriType.addActionListener(this);
        formulaPanel.add(TriPerimeterTriType);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == CalculatorButton) {
            BaseCalc calc = new BaseCalc();
            calc.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if (e.getSource() == QuadButton) {
            ShapePanel.triangle.setVisible(false);
            ShapePanel.yLabelChanger.setVisible(true);
            ShapePanel.yLabelShower.setVisible(true);
            ShapePanel.ySlider.setVisible(true);
            ShapePanel.areaLblForQuad.setVisible(true);
            ShapePanel.xLabelChanger.setVisible(true);
            ShapePanel.xLabelShower.setVisible(true);
            ShapePanel.xSlider.setVisible(true);
            ShapePanel.heightLblShow.setVisible(true);
            ShapePanel.heightLblChange.setVisible(true);
            ShapePanel.circle.setVisible(false);
            ShapePanel.sqrdisplay.setVisible(true);
            ShapePanel.sqrdisplay.setBackground(Color.BLACK);
            ShapePanel.widthSlider.setVisible(true);
            ShapePanel.widthLblChange.setVisible(true);
            ShapePanel.widthLblShow.setVisible(true);
            ShapePanel.heightSlider.setVisible(true);
        }

        if(e.getSource() == CircleButton) {
            ShapePanel.triangle.setVisible(false);
            ShapePanel.yLabelChanger.setVisible(false);
            ShapePanel.yLabelShower.setVisible(false);
            ShapePanel.ySlider.setVisible(false);
            ShapePanel.areaLblForQuad.setVisible(false);
            ShapePanel.xLabelChanger.setVisible(false);
            ShapePanel.xLabelShower.setVisible(false);
            ShapePanel.xSlider.setVisible(false);
            ShapePanel.heightLblShow.setVisible(false);
            ShapePanel.heightLblChange.setVisible(false);
            ShapePanel.heightSlider.setVisible(false);
            ShapePanel.widthSlider.setVisible(false);
            ShapePanel.widthLblChange.setVisible(false);
            ShapePanel.widthLblShow.setVisible(false);
            ShapePanel.sqrdisplay.setVisible(false);
            ShapePanel.circle.setVisible(true);
            ShapePanel.circle.changeColorOfTheCircle();
        }

        if(e.getSource() == Trianglebutton) {
            ShapePanel.yLabelChanger.setVisible(false);
            ShapePanel.yLabelShower.setVisible(false);
            ShapePanel.ySlider.setVisible(false);
            ShapePanel.areaLblForQuad.setVisible(false);
            ShapePanel.xLabelChanger.setVisible(false);
            ShapePanel.xLabelShower.setVisible(false);
            ShapePanel.xSlider.setVisible(false);
            ShapePanel.heightLblShow.setVisible(false);
            ShapePanel.heightLblChange.setVisible(false);
            ShapePanel.heightSlider.setVisible(false);
            ShapePanel.widthSlider.setVisible(false);
            ShapePanel.widthLblChange.setVisible(false);
            ShapePanel.widthLblShow.setVisible(false);
            ShapePanel.sqrdisplay.setVisible(false);
            ShapePanel.circle.setVisible(false);
            ShapePanel.triangle.setVisible(true);
            ShapePanel.triangle.changeColorOfTriangle();
        }

        if (CircleRbtn.isSelected()) {
            CircleGUI circle = new CircleGUI();
            circle.Circleframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if(TriangleRbtn.isSelected()){
            TriangleAreaGUI triangle = new TriangleAreaGUI();
            triangle.TriangleFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if(OpenQuad.isSelected()) {
            QuadTypeGUI quadTypeGUI = new QuadTypeGUI();
            quadTypeGUI.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if(TriPerimeterTriType.isSelected()) {
            TriTypePerimeterGUI triEx = new TriTypePerimeterGUI();
            triEx.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }
}