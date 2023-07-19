import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class StopwatchComponents extends JFrame {
         private JLabel myStopwatch, timerInfo;
         private JButton click;
         private ImageIcon imageClick;
         private Font font;
         private int second;
         private  ScheduledExecutorService executor;
         public StopwatchComponents(){
             super("Stopwatch");
             setLayout(null);

             font = new Font("Arial", Font.BOLD, 16);

             myStopwatch = new JLabel("My stopwatch!");
             myStopwatch.setBounds(85, -42, 140, 115);
             myStopwatch.setFont(font);

             second = 0;

             imageClick = new ImageIcon("src/newImage.jpg");


             timerInfo = new JLabel("");
             timerInfo.setBounds(100, -10, 180, 180);
             timerInfo.setFont(font);

             click = new JButton();
             click.setBorder(BorderFactory.createEmptyBorder());
             click.setBounds(53, 130, 165, 50);
             click.setIcon(imageClick);
             click.addActionListener(e -> {
                 try {
                     executor = Executors.newSingleThreadScheduledExecutor();
                     executor.scheduleAtFixedRate(() -> {
                         second++;
                         timerInfo.setText("timer: " + second + " s");
                     },1, 1, TimeUnit.SECONDS);
                 }catch (Exception exception){}

             });
             click.setFont(font);

             add(timerInfo);
             add(click);
             add(myStopwatch);
         }
}
