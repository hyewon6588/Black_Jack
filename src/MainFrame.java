import com.sun.org.apache.xml.internal.security.Init;
import javax.swing.ImageIcon; // ImgaeIcon 참조
import java.math.*;

public class MainFrame extends javax.swing.JFrame {

    public static String[][] CardDup = new String[4][13];
    public static String[] mycard = new String[5];
    public static String[] ecard = new String[5];
    public static String[] usecard = new String[10];
    static int usecnt = 0;

    public MainFrame() {

        initComponents();
        String shape[] = { "Spade", "Heart", "Club", "Diamond" };
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 14; j++) {
                if (j <= 10) {
                    if (j == 1)
                        CardDup[i - 1][j - 1] = shape[i - 1] + "A";
                    else
                        CardDup[i - 1][j - 1] = shape[i - 1] + Integer.toString(j);
                } else if (j == 11) {
                    // A가 11로 처리될 경우에 추가.
                } else if (j == 12) {
                    CardDup[i - 1][j - 2] = shape[i - 1] + "Jack";
                } else if (j == 13) {
                    CardDup[i - 1][j - 2] = shape[i - 1] + "Queen";
                } else {
                    CardDup[i - 1][j - 2] = shape[i - 1] + "King";
                }
            }
        }
        // 카드 중복검사용 배열을 만든다. (총 52장)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GameFrame = new javax.swing.JFrame();
        imgDeck = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnGameRule = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imgFirstCard_E = new javax.swing.JLabel();
        imgSecondCard_E = new javax.swing.JLabel();
        imgThirdCard_E = new javax.swing.JLabel();
        imgFourthCard_E = new javax.swing.JLabel();
        imgFivethCard_E = new javax.swing.JLabel();
        lblEnemyDeck = new javax.swing.JLabel();
        lblYourDeck = new javax.swing.JLabel();
        imgFirstCard = new javax.swing.JLabel();
        imgSecondCard = new javax.swing.JLabel();
        imgThirdCard = new javax.swing.JLabel();
        imgFourthCard = new javax.swing.JLabel();
        imgFivethCard = new javax.swing.JLabel();
        btnCardAdd = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        lblEntirely = new javax.swing.JLabel();
        RuleFrame = new javax.swing.JDialog();
        lblRuleTitle = new javax.swing.JLabel();
        lblRule1 = new javax.swing.JLabel();
        lblRule2 = new javax.swing.JLabel();
        lblRule3 = new javax.swing.JLabel();
        cmbCard = new javax.swing.JComboBox<>();
        imgSpade = new javax.swing.JLabel();
        imgClub = new javax.swing.JLabel();
        imgHeart = new javax.swing.JLabel();
        imgDiamond = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ResultFrame = new javax.swing.JDialog();
        lblResult = new javax.swing.JLabel();
        lbleSum = new javax.swing.JLabel();
        lblmySum = new javax.swing.JLabel();
        btnGotoMain = new javax.swing.JButton();
        btnResultExit = new javax.swing.JButton();
        btnRetry = new javax.swing.JButton();
        lblGameTitle = new javax.swing.JLabel();
        btnGameStart = new javax.swing.JButton();
        btnRule = new javax.swing.JButton();
        btnTitleExit = new javax.swing.JButton();

        GameFrame.getContentPane().setLayout(null);

        imgDeck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgDeck);
        imgDeck.setBounds(414, 237, 100, 143);

        btnStart.setText("시작 하기");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        GameFrame.getContentPane().add(btnStart);
        btnStart.setBounds(669, 225, 93, 27);

        btnGameRule.setText("룰 설명");
        btnGameRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameRuleActionPerformed(evt);
            }
        });
        GameFrame.getContentPane().add(btnGameRule);
        btnGameRule.setBounds(669, 291, 85, 27);

        btnExit.setText("그만 하기");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        GameFrame.getContentPane().add(btnExit);
        btnExit.setBounds(669, 353, 93, 27);

        imgFirstCard_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgFirstCard_E);
        imgFirstCard_E.setBounds(76, 20, 100, 143);

        imgSecondCard_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgSecondCard_E);
        imgSecondCard_E.setBounds(233, 20, 100, 143);

        imgThirdCard_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgThirdCard_E);
        imgThirdCard_E.setBounds(414, 20, 100, 143);

        imgFourthCard_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgFourthCard_E);
        imgFourthCard_E.setBounds(580, 20, 100, 143);

        imgFivethCard_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgFivethCard_E);
        imgFivethCard_E.setBounds(750, 20, 100, 143);

        lblEnemyDeck.setText("↑상대방의 손패↑");
        GameFrame.getContentPane().add(lblEnemyDeck);
        lblEnemyDeck.setBounds(405, 192, 109, 15);

        lblYourDeck.setText("↓당신의 손패↓");
        GameFrame.getContentPane().add(lblYourDeck);
        lblYourDeck.setBounds(410, 413, 95, 18);

        imgFirstCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgFirstCard);
        imgFirstCard.setBounds(76, 465, 100, 143);

        imgSecondCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgSecondCard);
        imgSecondCard.setBounds(233, 465, 100, 143);

        imgThirdCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgThirdCard);
        imgThirdCard.setBounds(414, 465, 100, 143);

        imgFourthCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgFourthCard);
        imgFourthCard.setBounds(580, 465, 100, 143);

        imgFivethCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N
        GameFrame.getContentPane().add(imgFivethCard);
        imgFivethCard.setBounds(750, 465, 100, 143);

        btnCardAdd.setLabel("카드 추가");
        btnCardAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardAddActionPerformed(evt);
            }
        });
        GameFrame.getContentPane().add(btnCardAdd);
        btnCardAdd.setBounds(240, 409, 93, 27);

        btnStop.setText("승부 하기");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        GameFrame.getContentPane().add(btnStop);
        btnStop.setBounds(580, 409, 93, 27);

        lblEntirely.setText("승 : / 패 : / 무 : ");
        GameFrame.getContentPane().add(lblEntirely);
        lblEntirely.setBounds(70, 420, 130, 18);

        lblRuleTitle.setFont(new java.awt.Font("맑은 고딕", 0, 36)); // NOI18N
        lblRuleTitle.setText("룰 설명");

        lblRule1.setText("1. 받은 카드들의 합을 21에 가까운 숫자로 맞추되, 21을 넘어가면 안되는 게임");
        lblRule1.setToolTipText("");

        lblRule2.setText("3. 최대 5장까지 카드를 받아볼 수 있다.");
        lblRule2.setToolTipText("");

        lblRule3.setText("4. 카드들의 수는 다음과 같다.");

        cmbCard.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" }));
        cmbCard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCardItemStateChanged(evt);
            }
        });

        imgSpade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N

        imgClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N

        imgHeart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N

        imgDiamond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Back.png"))); // NOI18N

        lblCardNumber.setText("이 카드들의 수는 * 이다.");

        jLabel1.setText("2. 21이 넘어가면 패배, 두사람 모두 21이 넘어가면 무승부");

        javax.swing.GroupLayout RuleFrameLayout = new javax.swing.GroupLayout(RuleFrame.getContentPane());
        RuleFrame.getContentPane().setLayout(RuleFrameLayout);
        RuleFrameLayout.setHorizontalGroup(RuleFrameLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RuleFrameLayout.createSequentialGroup().addContainerGap().addGroup(RuleFrameLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblRuleTitle)
                        .addComponent(lblRule1)
                        .addGroup(RuleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbCard, javax.swing.GroupLayout.Alignment.LEADING, 0,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRule3, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
                        .addGroup(RuleFrameLayout.createSequentialGroup().addComponent(imgSpade).addGap(18, 18, 18)
                                .addComponent(imgClub).addGap(18, 18, 18).addComponent(imgHeart).addGap(18, 18, 18)
                                .addComponent(imgDiamond))
                        .addComponent(lblCardNumber).addComponent(lblRule2).addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        RuleFrameLayout.setVerticalGroup(RuleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RuleFrameLayout.createSequentialGroup().addContainerGap().addComponent(lblRuleTitle)
                        .addGap(18, 18, 18).addComponent(lblRule1).addGap(13, 13, 13).addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lblRule2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lblRule3)
                        .addGap(10, 10, 10)
                        .addComponent(cmbCard, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RuleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(imgSpade).addComponent(imgClub).addComponent(imgHeart)
                                .addComponent(imgDiamond))
                        .addGap(18, 18, 18).addComponent(lblCardNumber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        ResultFrame.getContentPane().setLayout(null);

        lblResult.setFont(new java.awt.Font("맑은 고딕", 0, 36)); // NOI18N
        lblResult.setText("결과");
        ResultFrame.getContentPane().add(lblResult);
        lblResult.setBounds(156, 24, 150, 49);

        lbleSum.setText("상대방의 패의 합 : ");
        ResultFrame.getContentPane().add(lbleSum);
        lbleSum.setBounds(71, 103, 250, 18);

        lblmySum.setText("내 패의 합 : ");
        ResultFrame.getContentPane().add(lblmySum);
        lblmySum.setBounds(71, 159, 250, 18);

        btnGotoMain.setText("메인 으로");
        btnGotoMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoMainActionPerformed(evt);
            }
        });
        ResultFrame.getContentPane().add(btnGotoMain);
        btnGotoMain.setBounds(12, 267, 93, 27);

        btnResultExit.setText("종료 하기");
        btnResultExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultExitActionPerformed(evt);
            }
        });
        ResultFrame.getContentPane().add(btnResultExit);
        btnResultExit.setBounds(160, 267, 93, 27);

        btnRetry.setText("다시 하기");
        btnRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetryActionPerformed(evt);
            }
        });
        ResultFrame.getContentPane().add(btnRetry);
        btnRetry.setBounds(303, 267, 93, 27);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGameTitle.setFont(new java.awt.Font("맑은 고딕", 0, 36)); // NOI18N
        lblGameTitle.setText("블랙잭");

        btnGameStart.setText("게임 시작");
        btnGameStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameStartActionPerformed(evt);
            }
        });

        btnRule.setText("룰 설명");
        btnRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuleActionPerformed(evt);
            }
        });

        btnTitleExit.setText("게임 종료");
        btnTitleExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitleExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(142, 142, 142).addComponent(lblGameTitle))
                        .addGroup(layout.createSequentialGroup().addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnGameStart, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRule, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTitleExit))))
                .addContainerGap(150, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(25, 25, 25).addComponent(lblGameTitle)
                        .addGap(50, 50, 50).addComponent(btnGameStart).addGap(18, 18, 18).addComponent(btnRule)
                        .addGap(18, 18, 18).addComponent(btnTitleExit).addContainerGap(71, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // 초기화(시작하면에서 게임시작을 눌렀을떄)
    public void reset() {
        mycard = new String[5];
        ecard = new String[5];
        usecard = new String[10];
        usecnt = 0;
        imgFirstCard.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgSecondCard.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgFirstCard_E.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgSecondCard_E.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgThirdCard.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgThirdCard_E.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgFourthCard.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgFourthCard_E.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgFivethCard.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgFivethCard_E.setIcon(new ImageIcon("./img/Card_Back.png"));
        imgFirstCard.setVisible(true);
        imgSecondCard.setVisible(true);
        imgFirstCard_E.setVisible(true);
        imgSecondCard_E.setVisible(true);
        imgThirdCard.setVisible(true);
        imgThirdCard_E.setVisible(true);
        imgFourthCard.setVisible(true);
        imgFourthCard_E.setVisible(true);
        imgFivethCard.setVisible(true);
        imgFivethCard_E.setVisible(true);
        btnStart.setVisible(true);
        btnExit.setVisible(true);
    }

    // 카드 뽑기 및 중복 검사
    public void card(String[] card, int cnt) {
        int start = 0;
        for (String card_ : card) {
            if (card_ != null)
                start++;
        }
        for (int i = start; i < cnt; i++) {
            int cns = (int) (Math.floor(Math.random() * 4)) + 1;
            int cnn = ((int) Math.floor(Math.random() * 13)) + 1;
            if (((i >= 1 && card[i] == card[i - 1])) == true) { // i가 1이상일떄
                i--;
                continue;
            }
            boolean flag = false; // 중복 체크
            for (String c : usecard) {
                if (CardDup[cns - 1][cnn - 1] == c) {
                    flag = true;
                }
            }
            if (flag) {
                i--;
                continue;
            }
            usecard[usecnt++] = CardDup[cns - 1][cnn - 1];
            card[i] = CardDup[cns - 1][cnn - 1];
        }
    }

    // 카드들의 합 계산
    public int checkSum(String card[]) {
        int idx = 0; // 몇번째 배열인지 확인하는 임시변수
        int Sum = 0; // 합을 저장할 변수

        while (!(card[idx] == null)) // 배열의 원소값이 null이 아니고
        {
            if (idx < 5) // idx 의 번호가 5보다 작으면 (0 ~ 4)
            {
                int i = 0;
                int j = 0;
                while (card[idx] != CardDup[i][j]) // CardDup[i][j] 의 원소 값과 card[idx] 의 원소값이 같으면
                {
                    if (j == 12) {
                        i++;
                        j = 0;
                    } else {
                        j++;
                    }
                }
                if (j < 10) {
                    Sum += j + 1;
                } // j가 10보다 작을 경우엔 + 1 한 값을 더해주고
                else if (j == 10 || j == 11 || j == 12) {
                    Sum += 10;
                } // 10,11,12 의 경우 + 10
            }
            idx++; // 다음 카드 확인
            if (idx >= 5)
                break;
        }

        return Sum; // 계산이 끝난 값을 반환
    }

    // 메인 프레임에서 게임 시작 버튼을 눌렀을때
    private void btnGameStartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGameStartActionPerformed
        GameFrame.setSize(920, 675);
        GameFrame.show(); // 게임 프레임을 보여준다.
        reset();
    }// GEN-LAST:event_btnGameStartActionPerformed

    // 메인 프레임에서 게임 종료 버튼을 눌렀을때
    private void btnTitleExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTitleExitActionPerformed
        System.exit(0); // 프로그램 종료
    }// GEN-LAST:event_btnTitleExitActionPerformed

    // 게임 프레임 안에서 룰 설명 버튼을 눌렀을때
    private void btnGameRuleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGameRuleActionPerformed
        RuleFrame.setSize(478, 443);
        RuleFrame.show();
    }// GEN-LAST:event_btnGameRuleActionPerformed

    // 게임 프레임 안에서 그만하기 버튼을 눌렀을때
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
        GameFrame.dispose(); // 게임 프레임 종료
    }// GEN-LAST:event_btnExitActionPerformed

    // 메인 프레임에서 룰 설명 버튼을 눌렀을 때
    private void btnRuleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRuleActionPerformed
        RuleFrame.setSize(478, 443);
        RuleFrame.show();
    }// GEN-LAST:event_btnRuleActionPerformed

    // 게임 프레임에서 시작하기 버튼을 눌렀을때
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStartActionPerformed
        btnExit.setVisible(false);
        btnStart.setVisible(false);
        imgThirdCard.setVisible(false);
        imgFourthCard.setVisible(false);
        imgFivethCard.setVisible(false);// 3번째 4번째 5번째 카드를 안보이게 바꾼다.(추후 차례로 받아옴)
        imgThirdCard_E.setVisible(false);
        imgFourthCard_E.setVisible(false);
        imgFivethCard_E.setVisible(false);
        System.out.println("게임시작!!");
        card(mycard, 2);
        card(ecard, 2);
        imgFirstCard.setIcon(new ImageIcon("./img/" + mycard[0] + ".png"));
        imgSecondCard.setIcon(new ImageIcon("./img/" + mycard[1] + ".png"));
        // imgFirstCard_E.setIcon(new ImageIcon("./img/" + ecard[0] + ".png"));
        // imgSecondCard_E.setIcon(new ImageIcon("./img/" + ecard[1] + ".png"));
        // imgFirstCard, imgSecondCard 에 랜덤하게 카드를 2장 받아온다. (중복 없음)
        // 받아온 카드에 맞게 imgFirstCard 와 imgSecondCard 의 이미지를 바꾼다.(앞면 보여줌)
        // imgFirstCard_E, imgSecondCard_E 에도 랜덤하게 카드를 2장 받아온다.
        // ~~~Card_E 는 상대방의 패이므로 이미지를 바꾸지는 않는다.(뒷면 보여줌)
        checkCom();
    }// GEN-LAST:event_btnStartActionPerformed

    // 룰 프레임에 있는 콤보박스의 내용이 바뀌었을때
    private void cmbCardItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cmbCardItemStateChanged
        // imgSpade, imgClub, imgHeart, imgDiamond 의 이미지를 바꾼 콤보박스의 내용과 동일하게 바꾼다.
        String card = cmbCard.getSelectedItem().toString();
        imgSpade.setIcon(new ImageIcon("./img/Spade" + card + ".png"));
        imgClub.setIcon(new ImageIcon("./img/Club" + card + ".png"));
        imgHeart.setIcon(new ImageIcon("./img/Heart" + card + ".png"));
        imgDiamond.setIcon(new ImageIcon("./img/Diamond" + card + ".png"));

        // lblCardNumber 의 "이 카드들의 수는 * 이다" 를 콤보박스의 내용과 맞는 숫자로 바꾸어준다.
        switch (card) {
        case "A": // A 를 선택 했을 때
            lblCardNumber.setText("이 카드들의 수는 1 이다.");
            break;
        case "Jack": // Jack 을 선택 했을 때
            lblCardNumber.setText("이 카드들의 수는 10 이다.");
            break;
        case "Queen": // Queen 을 선택 했을 때
            lblCardNumber.setText("이 카드들의 수는 10 이다.");
            break;
        case "King": // King 을 선택 했을 때
            lblCardNumber.setText("이 카드들의 수는 10 이다.");
            break;
        default: // 그외 나머지 숫자들을 선택 했을 때
            lblCardNumber.setText("이 카드들의 수는 " + card + " 이다.");
            break;
        }
    }// GEN-LAST:event_cmbCardItemStateChanged

    // 게임 프레임에 있는 카드 추가 버튼을 눌렀을때
    private void btnCardAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCardAddActionPerformed
        if (!(imgThirdCard.isVisible())) {
            System.out.println("세번째카드 뽑기");
            card(mycard, 3);
            imgThirdCard.setVisible(true);
            imgThirdCard.setIcon(new ImageIcon("./img/" + mycard[2] + ".png"));
            if ((21 - checkSum(ecard)) >= 7) {
                card(ecard, 3);
                imgThirdCard_E.setVisible(true);

            }
            checkCom();
        } else if ((imgThirdCard.isVisible() == true) && (imgFourthCard.isVisible() == false)) {
            System.out.println("네번째카드 뽑기");
            card(mycard, 4);
            imgFourthCard.setVisible(true);
            imgFourthCard.setIcon(new ImageIcon("./img/" + mycard[3] + ".png"));
            if (21 - (checkSum(ecard)) >= 7) {
                card(ecard, 4);
                imgFourthCard_E.setVisible(true);
                checkCom();
            }

        } else if ((imgFourthCard.isVisible() == true) && (imgFivethCard.isVisible() == false)) {
            System.out.println("다섯번째카드 뽑기");
            card(mycard, 5);
            imgFivethCard.setVisible(true);
            imgFivethCard.setIcon(new ImageIcon("./img/" + mycard[4] + ".png"));
            if (21 - (checkSum(ecard)) >= 7) {
                card(ecard, 5);
                imgFivethCard_E.setVisible(true);
                checkCom();
            }
        }
        // 비어있는 카드에 랜덤하게 카드를 한장 추가한다.(랜덤처리 아직 안함)
        else// if(imgFivethCard.isVisible()==true)
            System.out.println("더이상 추가할 수 없습니다!");
        // 만약 카드수가 5장이 넘어가면 "더이상 추가할수 없습니다!" 를 출력

    }// GEN-LAST:event_btnCardAddActionPerformed

    // 게임 프레임에 있는 승부 하기 버튼을 눌렀을때
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStopActionPerformed
        // 내가 갖고있는 손패들의 합이 21에 더 가까우면 상대방의 손패의 합과 "승리!" 를 대화상자로 출력

        // System.out.println("상대방의 손패의 합" + eSum);
        // 상대방의 손패들의 합이 21에 더 가까우면 상대방의 손패의합과 "패배!" 를 대화상자로 출력
        checkWin();

    }// GEN-LAST:event_btnStopActionPerformed

    // 결과 창에서 메인 으로 버튼을 눌렀을때
    private void btnGotoMainActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGotoMainActionPerformed
        GameFrame.dispose();
        ResultFrame.dispose();
    }// GEN-LAST:event_btnGotoMainActionPerformed

    // 결과 창에서 종료 하기 버튼을 눌렀을때
    private void btnResultExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResultExitActionPerformed
        System.exit(0);
    }// GEN-LAST:event_btnResultExitActionPerformed

    // 결과 창에서 다시 하기 버튼을 눌렀을때
    private void btnRetryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRetryActionPerformed
        ResultFrame.dispose();
    }// GEN-LAST:event_btnRetryActionPerformed

    public void checkWin() {
        int mySum = checkSum(mycard);
        // System.out.println("내 손패의 합" + mySum);
        int eSum = checkSum(ecard);

        ResultFrame.setSize(400, 350);
        ResultFrame.show();

        if (mySum == 21) {
            lblResult.setText("승리!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (eSum == 21) {
            lblResult.setText("패배!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (mySum > 21 && eSum < 21) {
            lblResult.setText("패배!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (mySum < 21 && eSum < 21 && mySum < eSum) {
            lblResult.setText("패배!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (eSum > 21 && mySum < 21) {
            lblResult.setText("승리!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (eSum < 21 && mySum < 21 && mySum > eSum) {
            lblResult.setText("승리!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (eSum > 21 && mySum > 21) {
            lblResult.setText("무승부!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        } else if (eSum == mySum) {
            lblResult.setText("무승부!");
            lblmySum.setText("내 패의 합 : " + mySum);
            lbleSum.setText("상대방의 패의 합 : " + eSum);
        }
        // 리셋 전 승리,패배횟수 정하기
        btnExit.setVisible(true);
        btnStart.setVisible(true);
        reset();
    }

    public void checkCom() {
        int eSum = checkSum(ecard);
        if (eSum >= 17) {
            checkWin();
        }
    }

    public static void main(String args[]) {
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame GameFrame;
    private javax.swing.JDialog ResultFrame;
    private javax.swing.JDialog RuleFrame;
    private javax.swing.JButton btnCardAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGameRule;
    private javax.swing.JButton btnGameStart;
    private javax.swing.JButton btnGotoMain;
    private javax.swing.JButton btnResultExit;
    private javax.swing.JButton btnRetry;
    private javax.swing.JButton btnRule;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnTitleExit;
    private javax.swing.JComboBox<String> cmbCard;
    private javax.swing.JLabel imgClub;
    private javax.swing.JLabel imgDeck;
    private javax.swing.JLabel imgDiamond;
    private javax.swing.JLabel imgFirstCard;
    private javax.swing.JLabel imgFirstCard_E;
    private javax.swing.JLabel imgFivethCard;
    private javax.swing.JLabel imgFivethCard_E;
    private javax.swing.JLabel imgFourthCard;
    private javax.swing.JLabel imgFourthCard_E;
    private javax.swing.JLabel imgHeart;
    private javax.swing.JLabel imgSecondCard;
    private javax.swing.JLabel imgSecondCard_E;
    private javax.swing.JLabel imgSpade;
    private javax.swing.JLabel imgThirdCard;
    private javax.swing.JLabel imgThirdCard_E;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblEnemyDeck;
    private javax.swing.JLabel lblEntirely;
    private javax.swing.JLabel lblGameTitle;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblRule1;
    private javax.swing.JLabel lblRule2;
    private javax.swing.JLabel lblRule3;
    private javax.swing.JLabel lblRuleTitle;
    private javax.swing.JLabel lblYourDeck;
    private javax.swing.JLabel lbleSum;
    private javax.swing.JLabel lblmySum;
    // End of variables declaration//GEN-END:variables
}
