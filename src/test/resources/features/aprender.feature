Feature: Pesquisar Google


#se todos os cenarios tem o mesmo inicio, coloque-os em contexto
#Background

	Scenario: Pesquisar Youtube
    	Given A tela de Pesquisa Google
    	When pesquisar Youtube
    	Then aparecer Youtube
    
	Scenario: Contar Pesquisas
	 	Given A tela de Pesquisa Google
	 	When  Pesquisar 15
	 	Then  valor da pesquisa 16

