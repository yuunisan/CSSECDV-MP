package View;

import Controller.Main;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        HomePnl = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        managerBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        clientBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(800, 450));

        HomePnl.setBackground(new java.awt.Color(102, 102, 102));
        HomePnl.setPreferredSize(new java.awt.Dimension(801, 500));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
                ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 544, Short.MAX_VALUE));
        ContentLayout.setVerticalGroup(
                ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        Navigation.setBackground(new java.awt.Color(204, 204, 204));

        adminBtn.setBackground(new java.awt.Color(250, 250, 250));
        adminBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminBtn.setText("Admin Home");
        adminBtn.setFocusable(false);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        managerBtn.setBackground(new java.awt.Color(250, 250, 250));
        managerBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerBtn.setText("Manager Home");
        managerBtn.setFocusable(false);
        managerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(250, 250, 250));
        staffBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffBtn.setText("Staff Home");
        staffBtn.setFocusable(false);
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        clientBtn.setBackground(new java.awt.Color(250, 250, 250));
        clientBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clientBtn.setText("Client Home");
        clientBtn.setFocusable(false);
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(250, 250, 250));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
                NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NavigationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(adminBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                                .addComponent(managerBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clientBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        NavigationLayout.setVerticalGroup(
                NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NavigationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(managerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139,
                                        Short.MAX_VALUE)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
        HomePnl.setLayout(HomePnlLayout);
        HomePnlLayout.setHorizontalGroup(
                HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
                                .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        HomePnlLayout.setVerticalGroup(
                HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
                ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 980, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)));
        ContainerLayout.setVerticalGroup(
                ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HomePnl, javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adminBtnActionPerformed
        if (currentUser == null || currentUser.getRole() != 5) {
            logAccessDenied("NAVIGATION_ADMIN_HOME");
            JOptionPane.showMessageDialog(this, "Access Denied.", "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        adminHomePnl.showPnl("home");
        contentView.show(Content, "adminHomePnl");
    }// GEN-LAST:event_adminBtnActionPerformed

    private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_managerBtnActionPerformed
        if (currentUser == null || currentUser.getRole() != 4) {
            logAccessDenied("NAVIGATION_MANAGER_HOME");
            JOptionPane.showMessageDialog(this, "Access Denied.", "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        managerHomePnl.showPnl("home");
        contentView.show(Content, "managerHomePnl");
    }// GEN-LAST:event_managerBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_staffBtnActionPerformed
        if (currentUser == null || currentUser.getRole() != 3) {
            logAccessDenied("NAVIGATION_STAFF_HOME");
            JOptionPane.showMessageDialog(this, "Access Denied.", "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        staffHomePnl.showPnl("home");
        contentView.show(Content, "staffHomePnl");
    }// GEN-LAST:event_staffBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clientBtnActionPerformed
        if (currentUser == null || currentUser.getRole() != 2) {
            logAccessDenied("NAVIGATION_CLIENT_HOME");
            JOptionPane.showMessageDialog(this, "Access Denied.", "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        clientHomePnl.showPnl("home");
        contentView.show(Content, "clientHomePnl");
    }// GEN-LAST:event_clientBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
        loginNav();
    }// GEN-LAST:event_logoutBtnActionPerformed

    public Main main;
    public Model.User currentUser;
    public Login loginPnl = new Login();
    public Register registerPnl = new Register();

    private AdminHome adminHomePnl = new AdminHome();
    private ManagerHome managerHomePnl = new ManagerHome();
    private StaffHome staffHomePnl = new StaffHome();
    private ClientHome clientHomePnl = new ClientHome();

    private CardLayout contentView = new CardLayout();
    private CardLayout frameView = new CardLayout();

    public void init(Main controller) {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("CSSECDV - SECURITY Svcs");
        this.setLocationRelativeTo(null);

        this.main = controller;
        loginPnl.frame = this;
        registerPnl.frame = this;

        initializeDashboardPanels();

        Container.setLayout(frameView);
        Container.add(loginPnl, "loginPnl");
        Container.add(registerPnl, "registerPnl");
        Container.add(HomePnl, "homePnl");
        frameView.show(Container, "loginPnl");

        Content.setLayout(contentView);
        Content.add(adminHomePnl, "adminHomePnl");
        Content.add(managerHomePnl, "managerHomePnl");
        Content.add(staffHomePnl, "staffHomePnl");
        Content.add(clientHomePnl, "clientHomePnl");

        this.setVisible(true);
    }

    private void initializeDashboardPanels() {
        safeInitPanel("admin", adminHomePnl);
        safeInitPanel("client", clientHomePnl);
        safeInitPanel("manager", managerHomePnl);
        safeInitPanel("staff", staffHomePnl);
    }

    private void safeInitPanel(String panelName, Object panel) {
        try {
            if (panel instanceof AdminHome) {
                ((AdminHome) panel).init(main.sqlite);
            } else if (panel instanceof ManagerHome) {
                ((ManagerHome) panel).init(main.sqlite);
            } else if (panel instanceof StaffHome) {
                ((StaffHome) panel).init(main.sqlite);
            } else if (panel instanceof ClientHome) {
                ((ClientHome) panel).init(main.sqlite);
            }
        } catch (Exception ex) {
            // [2.4.3] - Catch panel initialization errors to prevent runtime crashes.
            JOptionPane.showMessageDialog(this,
                    "A screen could not be loaded. The application will continue in a safe state.",
                    "Application Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mainNav() {
        frameView.show(Container, "homePnl");
    }

    public void loginAction(String username, String password) {
        try {
            // 2.3.1 / 2.3.3: Reject-by-default — validate username format and password length
            // before touching the database. Use a generic error to avoid username enumeration.
            String usernameErr = Controller.InputValidator.validateUsername(username);
            if (usernameErr != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid username and/or password",
                        "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (password == null || password.isEmpty() || password.length() > Controller.InputValidator.MAX_PASSWORD_LENGTH) {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid username and/or password",
                        "Login Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            Model.User user = main.sqlite.getUser(username);
            if (user != null) {
                if (user.getRole() == 1 || user.getLocked() >= 5) {
                    // [2.5.3] - Log failed authentication attempts for unavailable/locked accounts.
                    main.sqlite.addLogs("LOGIN_FAILED", username,
                            "Authentication failed: account unavailable.",
                            new java.sql.Timestamp(new java.util.Date().getTime()).toString());
                    JOptionPane.showMessageDialog(this, "Account unavailable. Please contact support.",
                            "Login Error", JOptionPane.ERROR_MESSAGE);
                    loginNav();
                    return;
                }

                if (Controller.PasswordUtil.verifyPassword(password, user.getPassword())) {
                    main.sqlite.updateUserLock(username, 0);
                    String lastTimestamp = main.sqlite.getLastLogin(username);
                    // [2.5.3] - Log successful authentication attempts.
                    main.sqlite.addLogs("LOGIN", username, "User login successful",
                            new java.sql.Timestamp(new java.util.Date().getTime()).toString());

                    this.currentUser = user;
                    main.sqlite.currentUser = user;

                    JOptionPane.showMessageDialog(this,
                            "Authentication successful.\nLast login timestamp: " + lastTimestamp,
                            "Welcome", JOptionPane.INFORMATION_MESSAGE);

                    adminBtn.setVisible(false);
                    managerBtn.setVisible(false);
                    staffBtn.setVisible(false);
                    clientBtn.setVisible(false);

                    frameView.show(Container, "homePnl");
                    if(user.getRole() == 5) {
                        adminBtn.setVisible(true);
                        adminBtn.doClick();
                    }
                    else if(user.getRole() == 4) {
                        managerBtn.setVisible(true);
                        managerBtn.doClick();
                    }
                    else if(user.getRole() == 3) {
                        staffBtn.setVisible(true);
                        staffBtn.doClick();
                    }
                    else if(user.getRole() == 2) {
                        clientBtn.setVisible(true);
                        clientBtn.doClick();
                    }
                } else {
                    int fails = user.getLocked() + 1;
                    main.sqlite.updateUserLock(username, fails);
                    // [2.5.3] - Log failed authentication attempts with attempt counters.
                    main.sqlite.addLogs("LOGIN_FAILED", username,
                            "Authentication failed: invalid credentials (attempt " + fails + "/5).",
                            new java.sql.Timestamp(new java.util.Date().getTime()).toString());
                    if (fails >= 5) {
                        main.sqlite.updateUserRole(username, 1);
                    // [2.5.3] - Log lockout event when threshold is reached.
                        main.sqlite.addLogs("ACCOUNT_LOCKED", username,
                                "Account locked after repeated authentication failures.",
                                new java.sql.Timestamp(new java.util.Date().getTime()).toString());
                    }
                    JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Error",
                            JOptionPane.ERROR_MESSAGE);
                    loginNav();
                }
            } else {
                // [2.5.3] - Log failed authentication attempts for unknown usernames.
                main.sqlite.addLogs("LOGIN_FAILED", username,
                        "Authentication failed: unknown username.",
                        new java.sql.Timestamp(new java.util.Date().getTime()).toString());
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Error",
                        JOptionPane.ERROR_MESSAGE);
                loginNav();
            }
        } catch (Exception ex) {
            // [2.4.2] - Replace technical exception details with a user-friendly message.
            // [2.4.4] - Redirect to safe unprivileged state on unrecoverable runtime error.
            JOptionPane.showMessageDialog(this,
                    "The application encountered a problem and returned to a safe state.",
                    "Application Error", JOptionPane.ERROR_MESSAGE);
            loginNav();
        }
    }

    public void loginNav() {
        this.currentUser = null;
        if (main != null && main.sqlite != null)
            main.sqlite.currentUser = null;
        loginPnl.clearFields();
        frameView.show(Container, "loginPnl");
    }

    public void registerNav() {
        registerPnl.clearFields();
        frameView.show(Container, "registerPnl");
    }

    public boolean registerAction(String username, String password, String confpass) {
        try {
            boolean created = main.sqlite.addUser(username, password);
            if (!created) {
                JOptionPane.showMessageDialog(this,
                        "Registration failed. Please use a different username or try again.",
                        "Registration Error", JOptionPane.ERROR_MESSAGE);
            }
            return created;
        } catch (Exception ex) {
            // [2.4.2] - Keep registration error output generic and non-descriptive.
            JOptionPane.showMessageDialog(this,
                    "Registration could not be completed. The application stayed in a safe state.",
                    "Registration Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void logAccessDenied(String action) {
        if (main != null && main.sqlite != null) {
            String username = currentUser != null ? currentUser.getUsername() : "UNKNOWN";
            // [2.5.4] - Audit all attempts to access resources beyond assigned privileges.
            main.sqlite.addLogs("ACCESS_DENIED", username,
                    "Denied access attempt: " + action,
                    new java.sql.Timestamp(new java.util.Date().getTime()).toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel HomePnl;
    private javax.swing.JPanel Navigation;
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton clientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managerBtn;
    private javax.swing.JButton staffBtn;
    // End of variables declaration//GEN-END:variables
}
