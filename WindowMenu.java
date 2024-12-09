import javax.swing.*;

public class WindowMenu extends JFrame {
    JMenuBar menubar;
    JMenu menu_log, menu_need, menu_buy, menu_con, subMenu;
    JMenuItem item_in, item_out, item_over, item_mask, item_suit;

    public WindowMenu() { // ���ò˵���
        menubar = new JMenuBar();
        menu_log = new JMenu("�û���¼");
        menu_need = new JMenu("��������");
        menu_buy = new JMenu("����ֱ��");
        menu_con = new JMenu("��ϵ����");
        menubar.add(menu_log);
        menubar.add(menu_need);
        menubar.add(menu_buy);
        menubar.add(menu_con);

        JMenuItem item_in = new JMenuItem("�û���¼");
        JMenuItem item_out = new JMenuItem("�û��˳�");
        menu_log.add(item_in);
        menu_log.add(item_out);

        JMenuItem item_over = new JMenuItem("����");
        JMenuItem item_mask = new JMenuItem("���߿���");
        JMenuItem item_suit = new JMenuItem("������");
        menu_need.add(item_over);
        menu_need.addSeparator();
        menu_need.add(item_mask); // �ڸ����ͷ��߿���֮�����ָ���
        menu_need.add(item_suit);
        setJMenuBar(menubar);

    }
}
