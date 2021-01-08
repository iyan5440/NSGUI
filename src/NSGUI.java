



import javax.swing.DefaultListModel;


public class NSGUI extends javax.swing.JFrame {

    /*
    long stime = System.currentTimeMillis();
    call method
    long stime = System.currentTimeMillis - stime
    */
    //intitalize
    int nums[];
    //create model
    DefaultListModel model = new DefaultListModel();
    public NSGUI() {
        initComponents();
        //connect model to numList
        numList.setModel(model);
        btnss.setEnabled(false);
        btnis.setEnabled(false);
        btnbs.setEnabled(false);
        btnqs.setEnabled(false);
        btnclear.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadd = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnbs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnss = new javax.swing.JButton();
        btnis = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnqs = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        numList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnadd.setText("Generate Numbers");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        lbltime.setBackground(new java.awt.Color(0, 0, 0));
        lbltime.setForeground(new java.awt.Color(255, 255, 255));
        lbltime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltime.setText("...");
        lbltime.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnbs.setText("Bubble Sort");
        btnbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbsActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sorting Algorithms");

        btnss.setText("Selection Sort");
        btnss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnssActionPerformed(evt);
            }
        });

        btnis.setText("Insertion Sort");
        btnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbs)
                .addGap(18, 18, 18)
                .addComponent(btnss)
                .addGap(18, 18, 18)
                .addComponent(btnis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sorting Algorithms");

        btnqs.setText("Quick Sort");
        btnqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnqsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnqs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnqs)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnclear.setText("Clear List");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnclear)
                .addGap(18, 18, 18)
                .addComponent(btnexit)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(numList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        //exit
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        //data in numList is directly set to data in model
        //when model deletes data numList sets data
        model.clear();
        lbltime.setText("");
        btnadd.setEnabled(true);
        btnss.setEnabled(false);
        btnis.setEnabled(false);
        btnbs.setEnabled(false);
        btnqs.setEnabled(false);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnqsActionPerformed
        long stime = System.currentTimeMillis();
        quickSort(nums,0,nums.length-1);
        stime = System.currentTimeMillis() - stime;
        lbltime.setText(stime+" ms");
        model.clear();
        for (int i = 0; i < nums.length; i++) {
            model.addElement(nums[i]);
        }
        btnadd.setEnabled(false);
        btnss.setEnabled(false);
        btnis.setEnabled(false);
        btnbs.setEnabled(false);
        btnqs.setEnabled(false);
    }//GEN-LAST:event_btnqsActionPerformed

    private void btnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnisActionPerformed
        long stime = System.currentTimeMillis();
        insertionSort(nums);
        stime = System.currentTimeMillis() - stime;
        lbltime.setText(stime+" ms");
        model.clear();
        for (int i = 0; i < nums.length; i++) {
            model.addElement(nums[i]);
        }
        btnadd.setEnabled(false);
        btnss.setEnabled(false);
        btnis.setEnabled(false);
        btnbs.setEnabled(false);
        btnqs.setEnabled(false);
    }//GEN-LAST:event_btnisActionPerformed

    private void btnssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnssActionPerformed
        long stime = System.currentTimeMillis();
        selectionSort(nums);
        stime = System.currentTimeMillis() - stime;
        lbltime.setText(stime+" ms");
        model.clear();
        for (int i = 0; i < nums.length; i++) {
            model.addElement(nums[i]);
        }
        btnadd.setEnabled(false);
        btnss.setEnabled(false);
        btnis.setEnabled(false);
        btnbs.setEnabled(false);
        btnqs.setEnabled(false);
    }//GEN-LAST:event_btnssActionPerformed

    private void btnbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbsActionPerformed
        long stime = System.currentTimeMillis();
        bubbleSort(nums);
        stime = System.currentTimeMillis() - stime;
        lbltime.setText(stime+" ms");
        model.clear();
        for (int i = 0; i < nums.length; i++) {
            model.addElement(nums[i]);
        }
        btnadd.setEnabled(false);
        btnss.setEnabled(false);
        btnis.setEnabled(false);
        btnbs.setEnabled(false);
        btnqs.setEnabled(false);
    }//GEN-LAST:event_btnbsActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        //assign nums
        btnss.setEnabled(true);
        btnis.setEnabled(true);
        btnbs.setEnabled(true);
        btnqs.setEnabled(true);
        btnclear.setEnabled(true);
        lbltime.setText("");
        nums = new int[50000];
        //create random nums
        for (int i = 0; i < nums.length; i++) {
            //50000 random nums from 1 - 50000
            nums[i] = (int) (Math.random() * 50000) + 1;
            //adds each and every num into model
            //which adds into numList
            model.addElement(nums[i]);
        }
        btnadd.setEnabled(false);
        

    }//GEN-LAST:event_btnaddActionPerformed

    void quickSort(int[] a,int left,int right){
        if(left >= right) return;
        
        int i = left;
        int j = right;
        int pivotValue = a[(left + right)/2];
        while(i < j){
            while(a[i] < pivotValue) i++;
            while (pivotValue < a[j]) j--;
            if(i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            
        }
        quickSort(a,left,j);
        quickSort(a,i,right);
    }
    
    
    public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}//end for
    }//end method
    
    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++) { 
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while
    }

//supporting swap method

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

    //supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //supporting swap method (same as bubble sort swap)
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NSGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnbs;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnis;
    private javax.swing.JButton btnqs;
    private javax.swing.JButton btnss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltime;
    private javax.swing.JList<String> numList;
    // End of variables declaration//GEN-END:variables
}
