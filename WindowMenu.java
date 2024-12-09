import javax.swing.*;

public class WindowMenu extends JFrame {
    JMenuBar menubar;
    JMenu menu_log, menu_need, menu_buy, menu_con, subMenu;
    JMenuItem item_in, item_out, item_over, item_mask, item_suit;

    public WindowMenu() { // 设置菜单条
        menubar = new JMenuBar();
        menu_log = new JMenu("用户登录");
        menu_need = new JMenu("物资需求");
        menu_buy = new JMenu("阿里直采");
        menu_con = new JMenu("联系我们");
        menubar.add(menu_log);
        menubar.add(menu_need);
        menubar.add(menu_buy);
        menubar.add(menu_con);

        JMenuItem item_in = new JMenuItem("用户登录");
        JMenuItem item_out = new JMenuItem("用户退出");
        menu_log.add(item_in);
        menu_log.add(item_out);

        JMenuItem item_over = new JMenuItem("概览");
        JMenuItem item_mask = new JMenuItem("防疫口罩");
        JMenuItem item_suit = new JMenuItem("防护服");
        menu_need.add(item_over);
        menu_need.addSeparator();
        menu_need.add(item_mask); // 在概览和防疫口罩之间插入分割线
        menu_need.add(item_suit);
        setJMenuBar(menubar);

    }
}
