# Billing service :
  
  Pour tester Vault et Consul config 

- configs :

    Pour recuperer la configuration 

    - TokenConfigConsul

      <img src="./imgs/img.png">
  
    - UserConfigVault

      <img src="./imgs/img_1.png">


- web :

  <img src="./imgs/img_2.png">



- BillingApplication :
  
  Pour envoyer des secrets au Vault à partir de ce service
  
  <img src="./imgs/img_3.png">

- application.properties :

  <img src="./imgs/img_4.png">





- info : 

    - Lorsque on fait un changement dans config de consul automatiquement il change dans le service 
    - mais pour Vault il faut en voyer un request post pour refresh (et puisque on a utiliser @ConfigurationProperties on a pas besoin d'ajouter @RefreshScope ): 

      <img src="./imgs/img_5.png">
    
    
- initialiser la configuration :

    * Consul 

      <img src="./imgs/img_6.png">
      
      <img src="./imgs/img_7.png">
      
      <img src="./imgs/img_8.png">
    
    * Vault 

      <img src="./imgs/img_9.png">
    
- resulta :

    <img src="./imgs/img_10.png">





