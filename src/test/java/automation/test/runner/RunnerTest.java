package automation.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty", "html:target/report-html", "json:target/report-json"},
				 features = "src/test/resources/features",
				 glue = { "" }, //em que pacote ele deve procurar os meus passos passa o path de onde estão os steps
				 monochrome = false, 
				 dryRun = false //valida se o mapeamento está correto mude para TRUE 
				 //strict= false //quando executado ele dara failed se o passo nao existir
				 //tags = (minha tag) //serve para executar cenario s efeatures que tenham a tag em cima(possivel ignorar cenarios tbm), se colocar entre {} dápra colocar mais tags
				 )
public class RunnerTest {
	
	//@BeforeClass <<ESSE BEFORE é do Junit ele serve como um beforeall do behav// o before será executado antes do proprio cucumber
	//public static meumetodod(){}
}

//executaar via linha de comando
//EXECUCAO EM LINHA DE COMANDO-------
//mvn test
//mvn test -Dcucumber.opotions="-h" << TE DA AS OPCOES DE EXEUCAO POR LINHA DE COMANDO>

//https://srbarriga.herokuapp.com/login