import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.*;
import java.util.Objects;

public class Main extends JFrame {
    private static int lines;
    private static int chars;
    private static boolean isDirectory;
    private static boolean start = false;
    private static final boolean[] hasExtensions = new boolean[37];
    private static final String[] End = {
            ".java",
            ".c",
            ".cpp",
            ".cc",
            ".cxx",
            ".h",
            ".hpp",
            ".py",
            ".js",
            ".ts",
            ".rb",
            ".php",
            ".swift",
            ".kt",
            ".go",
            ".rs",
            ".scala",
            ".pl",
            ".lua",
            ".sh",
            ".cs",
            ".html",
            ".css",
            ".m",
            ".r",
            ".dart",
            ".sql",
            ".md",
            ".json",
            ".xml",
            ".yml",
            ".toml",
            ".f",
            ".pas",
            ".fs",
            ".txt"
    };

    private Main() {
        JTextField tf = new JTextField("", 20);
        JButton b = new JButton("开始普查");
        JButton b2 = new JButton("选择文件夹");

        Checkbox c1 = new Checkbox(".java");
        Checkbox c2 = new Checkbox(".c");
        Checkbox c3 = new Checkbox(".cpp");
        Checkbox c4 = new Checkbox(".cc");
        Checkbox c5 = new Checkbox(".cxx");
        Checkbox c6 = new Checkbox(".h");
        Checkbox c7 = new Checkbox(".hpp");
        Checkbox c8 = new Checkbox(".py");
        Checkbox c9 = new Checkbox(".js");
        Checkbox c10 = new Checkbox(".ts");
        Checkbox c11 = new Checkbox(".rb");
        Checkbox c12 = new Checkbox(".php");
        Checkbox c13 = new Checkbox(".swift");
        Checkbox c14 = new Checkbox(".kt");
        Checkbox c15 = new Checkbox(".go");
        Checkbox c16 = new Checkbox(".rs");
        Checkbox c17 = new Checkbox(".scala");
        Checkbox c18 = new Checkbox(".pl");
        Checkbox c19 = new Checkbox(".lua");
        Checkbox c20 = new Checkbox(".sh");
        Checkbox c21 = new Checkbox(".cs");
        Checkbox c22 = new Checkbox(".html");
        Checkbox c23 = new Checkbox(".css");
        Checkbox c24 = new Checkbox(".m");
        Checkbox c25 = new Checkbox(".r");
        Checkbox c26 = new Checkbox(".dart");
        Checkbox c27 = new Checkbox(".sql");
        Checkbox c28 = new Checkbox(".md");
        Checkbox c29 = new Checkbox(".json");
        Checkbox c30 = new Checkbox(".xml");
        Checkbox c31 = new Checkbox(".yml");
        Checkbox c32 = new Checkbox(".toml");
        Checkbox c33 = new Checkbox(".f");
        Checkbox c34 = new Checkbox(".pas");
        Checkbox c35 = new Checkbox(".fs");
        Checkbox c36 = new Checkbox(".txt");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(1680 / 2 - 500 / 2, 946 / 2 - 280 / 2);
        setTitle("Code Census 代码普查 -- by Missouri_of_god");
        setLayout(new FlowLayout());

        c1.addItemListener(e -> {
            hasExtensions[0] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c2.addItemListener(e -> {
            hasExtensions[1] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c3.addItemListener(e -> {
            hasExtensions[2] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c4.addItemListener(e -> {
            hasExtensions[3] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c5.addItemListener(e -> {
            hasExtensions[4] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c6.addItemListener(e -> {
            hasExtensions[5] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c7.addItemListener(e -> {
            hasExtensions[6] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c8.addItemListener(e -> {
            hasExtensions[7] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c9.addItemListener(e -> {
            hasExtensions[8] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c10.addItemListener(e -> {
            hasExtensions[9] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c11.addItemListener(e -> {
            hasExtensions[10] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c12.addItemListener(e -> {
            hasExtensions[11] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c13.addItemListener(e -> {
            hasExtensions[12] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c14.addItemListener(e -> {
            hasExtensions[13] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c15.addItemListener(e -> {
            hasExtensions[14] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c16.addItemListener(e -> {
            hasExtensions[15] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c17.addItemListener(e -> {
            hasExtensions[16] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c18.addItemListener(e -> {
            hasExtensions[17] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c19.addItemListener(e -> {
            hasExtensions[18] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c20.addItemListener(e -> {
            hasExtensions[19] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c21.addItemListener(e -> {
            hasExtensions[20] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c22.addItemListener(e -> {
            hasExtensions[21] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c23.addItemListener(e -> {
            hasExtensions[22] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c24.addItemListener(e -> {
            hasExtensions[23] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c25.addItemListener(e -> {
            hasExtensions[24] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c26.addItemListener(e -> {
            hasExtensions[25] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c27.addItemListener(e -> {
            hasExtensions[26] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c28.addItemListener(e -> {
            hasExtensions[27] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c29.addItemListener(e -> {
            hasExtensions[28] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c30.addItemListener(e -> {
            hasExtensions[29] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c31.addItemListener(e -> {
            hasExtensions[30] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c32.addItemListener(e -> {
            hasExtensions[31] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c33.addItemListener(e -> {
            hasExtensions[32] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c34.addItemListener(e -> {
            hasExtensions[33] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c35.addItemListener(e -> {
            hasExtensions[34] = e.getStateChange() == ItemEvent.SELECTED;
        });

        c36.addItemListener(e -> {
            hasExtensions[35] = e.getStateChange() == ItemEvent.SELECTED;
        });

        b2.addActionListener(e -> {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            jfc.showDialog(new JLabel(), "选择");
            tf.setText(jfc.getSelectedFile().getAbsolutePath());
        });

        b.addActionListener(e -> {
            repaint();
            start = true;
            lines = chars = 0;
            String path = tf.getText();
            File file = new File(path);
            if (!file.exists() || (!file.isDirectory() && !file.isFile())) isDirectory = false;
            else if (file.exists()) {
                if (file.isFile()) {
                    String end = file.getName();
                    if (hasEnd(end)) {
                        String read = readFile(path);
                        chars += read.length();
                        lines += read.split("\n").length + 1;
                    }
                } else readFromDirectory(file);

                isDirectory = true;
            }
        });
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
        add(c9);
        add(c10);
        add(c11);
        add(c12);
        add(c13);
        add(c14);
        add(c15);
        add(c16);
        add(c17);
        add(c18);
        add(c19);
        add(c20);
        add(c21);
        add(c22);
        add(c23);
        add(c24);
        add(c25);
        add(c26);
        add(c27);
        add(c28);
        add(c29);
        add(c30);
        add(c31);
        add(c32);
        add(c33);
        add(c34);
        add(c35);
        add(c36);

        add(tf);
        add(b);
        add(b2);

        Timer timer = new Timer(1, e -> {
            setSize(500, 280);
        });
        timer.start();
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);
        g.setFont(new Font("微软雅黑", Font.BOLD, 25));
        g.drawString("结果：", 80, 250);
        if (start) paintResult(g);
    }

    private void paintErrorResults(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("微软雅黑", Font.BOLD, 25));
        g.drawString("不是有效的文件目录！", 150, 250);
    }

    private void paintResult(Graphics g) {
        if (!isDirectory) {
            paintErrorResults(g);
            return;
        }
        g.setColor(Color.black);
        g.setFont(new Font("微软雅黑", Font.BOLD, 25));
        g.drawString("行数：   " + lines, 150, 230);
        g.drawString("字符数：" + chars, 150, 260);
    }

    private static String readFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (InputStream inputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream)) {

            int c;
            while ((c = inputStreamReader.read()) != -1) {
                contentBuilder.append((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return contentBuilder.toString();
    }

    private static void readFromDirectory(File directory) {
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory()) readFromDirectory(file);
            else if (hasEnd(file.getName())) {
                String read = readFile(file.getAbsolutePath());
                chars += read.length();
                lines += read.split("\n").length + 1;
            }
        }
    }

    private static boolean hasEnd(String name) {
        for (int i = 0; i < 36; i++) if (hasExtensions[i] && name.endsWith(End[i])) return true;
        return false;
    }
}
