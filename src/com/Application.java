/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.model.Endereco;
import com.model.Identificacao;
import com.model.Paciente;
import com.model.enums.Estados;
import com.service.PacienteService;
import java.awt.Image;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Cleysson Azevedo
 */
public class Application extends javax.swing.JFrame {
	private static final long serialVersionUID = -6357200364449441141L;
	private final PacienteService service;

	/**
	 * Creates new form Application
	 */
	public Application() {
		initComponents();
		this.service = new PacienteService();
		this.AtualizarTabelaPacientes();
		this.sexo = this.rd_nao_informado.getText();
		this.cb_estados.setSelectedIndex(24);
	}

	private void AtualizarTabelaPacientes() {
		this.tb_paciente.setModel(this.getPacientes());
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		_tab = new javax.swing.JTabbedPane();
		pn_lista_pacientes = new javax.swing.JPanel();
		tx_pesquisar = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane4 = new javax.swing.JScrollPane();
		tb_paciente = new javax.swing.JTable();
		pn_identificacao = new javax.swing.JPanel();
		tx_nome = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		tx_identificacao = new javax.swing.JTextField();
		tx_naturalidade = new javax.swing.JTextField();
		tx_logradouro = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		tx_numero = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		tx_cidade = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel9 = new javax.swing.JLabel();
		try {
			tx_cep = new javax.swing.JFormattedTextField(new MaskFormatter("#####-###"));
			cb_estados = new javax.swing.JComboBox<>();
			try {
				tx_cpf = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###-##"));
				jLabel11 = new javax.swing.JLabel();
				rd_nao_informado = new javax.swing.JRadioButton();
				rd_masculino = new javax.swing.JRadioButton();
				rd_feminino = new javax.swing.JRadioButton();
				rd_outro = new javax.swing.JRadioButton();
				jLabel12 = new javax.swing.JLabel();
				jLabel13 = new javax.swing.JLabel();
				jLabel14 = new javax.swing.JLabel();
				tx_bairro = new javax.swing.JTextField();
				pn_ficha = new javax.swing.JPanel();
				jScrollPane1 = new javax.swing.JScrollPane();
				tb_ficha_clinica = new javax.swing.JTable();
				jPanel3 = new javax.swing.JPanel();
				jScrollPane2 = new javax.swing.JScrollPane();
				tb_exames = new javax.swing.JTable();
				jPanel4 = new javax.swing.JPanel();
				jScrollPane3 = new javax.swing.JScrollPane();
				jTable1 = new javax.swing.JTable();
				btn_cancelar = new javax.swing.JButton();
				btn_salvar = new javax.swing.JButton();
				jMenuBar1 = new javax.swing.JMenuBar();
				btn_novo = new javax.swing.JMenu();
				jMenuItem1 = new javax.swing.JMenuItem();
				btn_sair = new javax.swing.JMenuItem();
				jMenu2 = new javax.swing.JMenu();

				setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
				setTitle("Medical Care");
				setIconImage(getImageIcon());
				setName("body"); // NOI18N
				addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowOpened(java.awt.event.WindowEvent evt) {
						formWindowOpened(evt);
					}
				});

				_tab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

				jLabel10.setText("Pesquisar");

				jButton1.setText("Pesquisar");

				tb_paciente.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Código", "Nome", "CPF", "Sexo" }) {
					Class[] types = new Class[] { java.lang.String.class, java.lang.String.class,
							java.lang.String.class, java.lang.String.class };
					boolean[] canEdit = new boolean[] { false, false, false, false };

					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}

					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
				tb_paciente.setColumnSelectionAllowed(false);
				tb_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						tb_pacienteMouseClicked(evt);
					}
				});
				jScrollPane4.setViewportView(tb_paciente);

				javax.swing.GroupLayout pn_lista_pacientesLayout = new javax.swing.GroupLayout(pn_lista_pacientes);
				pn_lista_pacientes.setLayout(pn_lista_pacientesLayout);
				pn_lista_pacientesLayout.setHorizontalGroup(pn_lista_pacientesLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pn_lista_pacientesLayout.createSequentialGroup().addContainerGap()
								.addGroup(pn_lista_pacientesLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1085,
												Short.MAX_VALUE)
										.addGroup(pn_lista_pacientesLayout.createSequentialGroup()
												.addGroup(pn_lista_pacientesLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(pn_lista_pacientesLayout.createSequentialGroup()
																.addComponent(jLabel10).addGap(0, 0, Short.MAX_VALUE))
														.addComponent(tx_pesquisar))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
				pn_lista_pacientesLayout.setVerticalGroup(
						pn_lista_pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pn_lista_pacientesLayout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel10)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pn_lista_pacientesLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36,
														Short.MAX_VALUE)
												.addComponent(tx_pesquisar))
										.addGap(18, 18, 18)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

				_tab.addTab("Lista de Pacientes", pn_lista_pacientes);

				pn_identificacao.setPreferredSize(new java.awt.Dimension(982, 600));

				jLabel1.setText("Código de Identificação");

				jLabel2.setText("Nome");

				tx_identificacao.setEditable(false);
				tx_identificacao.setBackground(new java.awt.Color(255, 255, 255));

				jLabel4.setText("CEP");

				jLabel5.setText("Logradouro");

				jLabel6.setText("Número");

				jLabel7.setText("Cidade");

				jLabel8.setText("Estado");

				jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
				jLabel9.setText("Endereço");

			} catch (Exception e) {
			}

			cb_estados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", // Acre
					"AL", // Alagoas
					"AP", // Amapá
					"AM", // Amazonas
					"BA", // Bahia
					"CE", // Ceará
					"DF", // Distrito Federal
					"ES", // Espírito Santo
					"GO", // Goiás
					"MA", // Maranhão
					"MT", // Mato Grosso
					"MS", // Mato Grosso do Sul
					"MG", // Minas Gerais
					"PA", // Pará
					"PB", // Paraíba
					"PR", // Paraná
					"PE", // Pernambuco
					"PI", // Piauí
					"RR", // Roraima
					"RO", // Rondônia
					"RJ", // Rio de Janeiro
					"RN", // Rio Grande do Norte
					"RS", // Rio Grande do Sul
					"SC", // Santa Catarina
					"SP", // São Paulo
					"SE" // Sergipe,
			}));

		} catch (Exception e) {

		}
		tx_cpf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tx_cpfActionPerformed(evt);
			}
		});

		jLabel11.setText("CPF");

		rd_nao_informado.setSelected(true);
		rd_nao_informado.setText("Não Informado");
		rd_nao_informado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rd_nao_informadoActionPerformed(evt);
			}
		});

		rd_masculino.setText("Masculino");
		rd_masculino.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rd_masculinoActionPerformed(evt);
			}
		});

		rd_feminino.setText("Feminino");
		rd_feminino.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rd_femininoActionPerformed(evt);
			}
		});

		rd_outro.setText("Outro");
		rd_outro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rd_outroActionPerformed(evt);
			}
		});

		jLabel12.setText("Sexo");

		jLabel13.setText("Naturalidade");

		jLabel14.setText("Bairro");

		javax.swing.GroupLayout pn_identificacaoLayout = new javax.swing.GroupLayout(pn_identificacao);
		pn_identificacao.setLayout(pn_identificacaoLayout);
		pn_identificacaoLayout.setHorizontalGroup(pn_identificacaoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jSeparator1)
				.addGroup(pn_identificacaoLayout.createSequentialGroup().addContainerGap()
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pn_identificacaoLayout.createSequentialGroup().addGroup(pn_identificacaoLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(tx_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 557,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pn_identificacaoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(tx_numero)
												.addGroup(pn_identificacaoLayout.createSequentialGroup()
														.addComponent(jLabel6).addGap(0, 0, Short.MAX_VALUE))))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										pn_identificacaoLayout.createSequentialGroup().addGroup(pn_identificacaoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(pn_identificacaoLayout.createSequentialGroup()
														.addGroup(pn_identificacaoLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel4).addComponent(jLabel9)
																.addComponent(tx_cep,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 270,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel1))
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														pn_identificacaoLayout.createSequentialGroup()
																.addGap(0, 6, Short.MAX_VALUE)
																.addGroup(pn_identificacaoLayout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel14).addComponent(tx_bairro,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				379,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(pn_identificacaoLayout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel7).addComponent(tx_cidade,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				379,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(pn_identificacaoLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel8).addComponent(cb_estados,
																javax.swing.GroupLayout.PREFERRED_SIZE, 315,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(pn_identificacaoLayout.createSequentialGroup().addGroup(pn_identificacaoLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(tx_identificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel11))
										.addGroup(pn_identificacaoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(pn_identificacaoLayout.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(pn_identificacaoLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(tx_nome)
																.addGroup(pn_identificacaoLayout.createSequentialGroup()
																		.addComponent(jLabel2)
																		.addGap(0, 0, Short.MAX_VALUE))))
												.addGroup(pn_identificacaoLayout.createSequentialGroup()
														.addGap(202, 202, 202).addComponent(jLabel13)
														.addGap(0, 0, Short.MAX_VALUE))))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_identificacaoLayout
										.createSequentialGroup().addComponent(tx_cpf)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(tx_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 286,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(pn_identificacaoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel12)
												.addGroup(pn_identificacaoLayout.createSequentialGroup()
														.addComponent(rd_masculino).addGap(18, 18, 18)
														.addComponent(rd_feminino).addGap(11, 11, 11)
														.addComponent(rd_outro)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(rd_nao_informado)))))
						.addContainerGap()));
		pn_identificacaoLayout.setVerticalGroup(pn_identificacaoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn_identificacaoLayout.createSequentialGroup().addContainerGap()
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(tx_identificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tx_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11).addComponent(jLabel12).addComponent(jLabel13))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pn_identificacaoLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(tx_cpf)
								.addComponent(tx_naturalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 35,
										Short.MAX_VALUE)
								.addGroup(pn_identificacaoLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(rd_nao_informado).addComponent(rd_feminino)
										.addComponent(rd_masculino).addComponent(rd_outro)))
						.addGap(18, 18, 18)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jLabel9).addGap(24, 24, 24).addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(tx_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(23, 23, 23)
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jLabel6))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(tx_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tx_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pn_identificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pn_identificacaoLayout.createSequentialGroup()
										.addGroup(pn_identificacaoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7).addComponent(jLabel8))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pn_identificacaoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(cb_estados, javax.swing.GroupLayout.DEFAULT_SIZE, 36,
														Short.MAX_VALUE)
												.addComponent(tx_cidade))
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(pn_identificacaoLayout.createSequentialGroup().addComponent(jLabel14)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(tx_bairro)))
						.addContainerGap()));

		_tab.addTab("Identificação", pn_identificacao);

		tb_ficha_clinica.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null } },
				new String[] { "Data de Atendimento", "Atestado", "Data de retorno" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tb_ficha_clinica);

		javax.swing.GroupLayout pn_fichaLayout = new javax.swing.GroupLayout(pn_ficha);
		pn_ficha.setLayout(pn_fichaLayout);
		pn_fichaLayout.setHorizontalGroup(pn_fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn_fichaLayout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
						.addContainerGap()));
		pn_fichaLayout.setVerticalGroup(pn_fichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn_fichaLayout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
						.addContainerGap()));

		_tab.addTab("Ficha Clínica", pn_ficha);

		tb_exames.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null }, { null, null }, { null, null } },
				new String[] { "Tipo de exame", "Data do exame" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(tb_exames);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addContainerGap()
								.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
								.addContainerGap()));

		_tab.addTab("Exames Complementares", jPanel3);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "Nome remédio", "Data início", "Data fim" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane3.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup().addContainerGap()
								.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
								.addContainerGap()));

		_tab.addTab("Prescrição Médica", jPanel4);

		btn_cancelar.setText("Cancelar");
		btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_cancelarActionPerformed(evt);
			}
		});

		btn_salvar.setText("Salvar");
		btn_salvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_salvarActionPerformed(evt);
			}
		});

		btn_novo.setText("Opções");

		jMenuItem1.setText("Novo");
		btn_novo.add(jMenuItem1);

		btn_sair.setText("Sair");
		btn_novo.add(btn_sair);

		jMenuBar1.add(btn_novo);

		jMenu2.setText("Edit");
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(_tab).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addComponent(_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 477,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void tb_pacienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tb_pacienteMouseClicked
		// TODO add your handling code here:]
		int row = this.tb_paciente.getSelectedRow();
		if (row != -1) {
			Long id = Long.parseLong(this.tb_paciente.getModel().getValueAt(row, 0).toString());
			this._tab.setSelectedIndex(1);
			this.setFormData(id);
		}
	}// GEN-LAST:event_tb_pacienteMouseClicked

	private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_salvarActionPerformed
		// TODO add your handling code here:
		Identificacao iden = new Identificacao.Builder()
				.setId(Long.parseLong(
						!tx_identificacao.getText().isEmpty()  
						? tx_identificacao.getText() : "0"))
				.setNome(tx_nome.getText())
				.setNaturalidade(tx_naturalidade.getText()).setSexo(this.sexo).setCPF(tx_cpf.getText())
				.setEndereco(new Endereco.Builder().setLogradouro(tx_logradouro.getText())
						.setNumero(tx_numero.getText()).setBairro(tx_bairro.getText()).setCidade(tx_cidade.getText())
						.setEstado(cb_estados.getSelectedItem().toString()).setCep(tx_cep.getText()).build())
				.build();
		try {
			int opcao = iden.getId() == 0 ? 0 : 1;
			
			if (this.service.save(iden, opcao)) {
				this.resetForm();
				this.AtualizarTabelaPacientes();
				this._tab.setSelectedIndex(0);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Falha ao salvar", "Falha", JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_btn_salvarActionPerformed

	private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_cancelarActionPerformed
		// TODO add your handling code here:
		this.resetForm();
	}// GEN-LAST:event_btn_cancelarActionPerformed

	private void tx_cpfActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tx_cpfActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tx_cpfActionPerformed

	private void rd_masculinoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rd_masculinoActionPerformed
		// TODO add your handling code here:
		this.rd_masculino.setSelected(true);
		this.rd_feminino.setSelected(false);
		this.rd_outro.setSelected(false);
		this.rd_nao_informado.setSelected(false);
		this.sexo = this.rd_masculino.getText();
	}// GEN-LAST:event_rd_masculinoActionPerformed

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened

	}// GEN-LAST:event_formWindowOpened

	private void rd_femininoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rd_femininoActionPerformed
		// TODO add your handling code here:
		this.rd_masculino.setSelected(false);
		this.rd_feminino.setSelected(true);
		this.rd_outro.setSelected(false);
		this.rd_nao_informado.setSelected(false);
		this.sexo = this.rd_feminino.getText();
	}// GEN-LAST:event_rd_femininoActionPerformed

	private void rd_outroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rd_outroActionPerformed
		// TODO add your handling code here:

		this.rd_masculino.setSelected(false);
		this.rd_feminino.setSelected(false);
		this.rd_outro.setSelected(true);
		this.rd_nao_informado.setSelected(false);
		this.sexo = this.rd_outro.getText();
	}// GEN-LAST:event_rd_outroActionPerformed

	private void rd_nao_informadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rd_nao_informadoActionPerformed
		// TODO add your handling code here:
		this.rd_masculino.setSelected(false);
		this.rd_feminino.setSelected(false);
		this.rd_outro.setSelected(false);
		this.rd_nao_informado.setSelected(false);
		this.sexo = this.rd_nao_informado.getText();
	}// GEN-LAST:event_rd_nao_informadoActionPerformed

	public DefaultTableModel getPacientes() {
		List<Paciente> pacientes = this.service.getPacientes();
		DefaultTableModel model = new DefaultTableModel(new String[] { "Codigo", "Nome", "CPF", "Sexo" }, 0);
		if (pacientes != null) {
			for (Paciente paciente : pacientes) {
				model.addRow(
						new Object[] { paciente.getId(), paciente.getNome(), paciente.getCpf(), paciente.getSexo() });
			}
		}

		return model;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
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
			java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new Application().setVisible(true);
		});
	}

	private String sexo;

	public Image getImageIcon() {
		return new ImageIcon(Application.class.getResource("./medical-history.png")).getImage();
	}

	private void setFormData(Long id) {
		this.resetForm();
		try {
			Identificacao ident = this.service.getPaciente(id);
			this.tx_identificacao.setText(ident.getId().toString());
			this.tx_nome.setText(ident.getNome());
			this.tx_cpf.setText(ident.getCpf());
			this.tx_naturalidade.setText(ident.getNaturalidade());

			switch (ident.getSexo()) {
				case "Masculino":
					this.rd_masculino.setSelected(true);
					this.rd_feminino.setSelected(false);
					this.rd_outro.setSelected(false);
					this.rd_nao_informado.setSelected(false);
				break;
				
				case "Feminino":
					this.rd_masculino.setSelected(false);
					this.rd_feminino.setSelected(true);
					this.rd_outro.setSelected(false);
					this.rd_nao_informado.setSelected(false);
				break;
				
				case "Não Informado":
					this.rd_masculino.setSelected(false);
					this.rd_feminino.setSelected(false);
					this.rd_outro.setSelected(false);
					this.rd_nao_informado.setSelected(true);
				break;
				
				case "Outro":
					this.rd_masculino.setSelected(false);
					this.rd_feminino.setSelected(false);
					this.rd_outro.setSelected(true);
					this.rd_nao_informado.setSelected(false);
				break;
					

				default:
					this.rd_masculino.setSelected(false);
					this.rd_feminino.setSelected(false);
					this.rd_outro.setSelected(false);
					this.rd_nao_informado.setSelected(false);
				break;
			}
			
			this.tx_cep.setText(ident.getEndereco().getCep());
			this.tx_logradouro.setText(ident.getEndereco().getLogradouro());
			this.tx_numero.setText(ident.getEndereco().getNumero());
			this.tx_bairro.setText(ident.getEndereco().getBairro());
			this.tx_cidade.setText(ident.getEndereco().getCidade());
			this.cb_estados.setSelectedIndex(Estados.valueOf(ident.getEndereco().getEstado()).getId());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void resetForm() {
		this.tx_identificacao.setText(null);
		this.tx_nome.setText(null);
		this.tx_naturalidade.setText(null);
		this.tx_cpf.setText(null);
		this.tx_cep.setText(null);
		this.tx_logradouro.setText(null);
		this.tx_numero.setText(null);
		this.tx_bairro.setText(null);
		this.tx_cidade.setText(null);
		this.cb_estados.setSelectedIndex(24);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTabbedPane _tab;
	private javax.swing.JButton btn_cancelar;
	private javax.swing.JMenu btn_novo;
	private javax.swing.JMenuItem btn_sair;
	private javax.swing.JButton btn_salvar;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JComboBox<String> cb_estados;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTable jTable1;
	private javax.swing.JPanel pn_ficha;
	private javax.swing.JPanel pn_identificacao;
	private javax.swing.JPanel pn_lista_pacientes;
	private javax.swing.JRadioButton rd_feminino;
	private javax.swing.JRadioButton rd_masculino;
	private javax.swing.JRadioButton rd_nao_informado;
	private javax.swing.JRadioButton rd_outro;
	private javax.swing.JTable tb_exames;
	private javax.swing.JTable tb_ficha_clinica;
	private javax.swing.JTable tb_paciente;
	private javax.swing.JTextField tx_bairro;
	private javax.swing.JFormattedTextField tx_cep;
	private javax.swing.JTextField tx_cidade;
	private javax.swing.JFormattedTextField tx_cpf;
	private javax.swing.JTextField tx_identificacao;
	private javax.swing.JTextField tx_logradouro;
	private javax.swing.JTextField tx_naturalidade;
	private javax.swing.JTextField tx_nome;
	private javax.swing.JTextField tx_numero;
	private javax.swing.JTextField tx_pesquisar;
	// End of variables declaration//GEN-END:variables
}
