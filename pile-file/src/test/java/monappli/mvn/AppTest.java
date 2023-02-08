package monappli.mvn;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    static Deque deque;
    /**
     * Rigorous Test :-)
     */
    @BeforeAll
    static void initAll() {
       deque = new Deque(null, null);
       System.out.println("InitAll");
    }
    @BeforeEach
    void init() {
        deque.viderDeque();
        System.out.println("Init");
    }

    @AfterEach
    void afficheOK(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Ajout et retrait de N valeurs")
    void ajouterTeteOterTeteNValeurs(){
        int i = 0;
        for(i=0;i<4;i++)deque.ajoutTete(i);
        assertFalse("L'élément n'as pa été ajouté",deque.dequeVide());
        for(i=3;i>=0;i--)assertEquals("L'élément retité n'est pas le bon",i,deque.oterTete());
        assertTrue("Tous les éléments n'ont pas été retirés",deque.dequeVide());  
    }

    @Test
    @DisplayName("Ajout et retrait de N valeurs")
    void ajouterTeteOterTeteUneValeur(){
        int val = 8;
        deque.ajoutTete(val);
        assertFalse("L'élément n'as pa été ajouté",deque.dequeVide());
        assertEquals("L'élément retité n'est pas le bon",val,deque.oterTete());
    }

    @Test
    @DisplayName("Ajout et retrait de N valeurs")
    void ajouterTeteOterTeteDeuxValeur(){
        int val1 = 8;
        int val2 = 24;
        deque.ajoutTete(val1);
        deque.ajoutTete(val2);
        assertFalse("L'élément n'as pa été ajouté",deque.dequeVide());
        assertEquals("L'élément retité n'est pas le bon",val2,deque.oterTete());
        assertEquals("L'élément retité n'est pas le bon",val1,deque.oterTete());
        assertTrue("L'élément n'as pas été ajouté",deque.dequeVide());
    }

    @Test
    @DisplayName("Ajout et retrait de N valeurs")
    void ajouterQueueOterQueueNValeurs(){
        int i = 0;
        for(i=0;i<4;i++)deque.ajoutQueue(i);
        assertFalse("L'élément n'as pa été ajouté",deque.dequeVide());
        for(i=3;i>=0;i--)assertEquals("L'élément retité n'est pas le bon",i,deque.oterQueue());
        assertTrue("Tous les éléments n'ont aps été retirés",deque.dequeVide());  
    }
 
    @Test
    @DisplayName("Ajout et retrait de N valeurs")
    void ajouterQueueOterQueueUneValeur(){
        int val = 8;
        deque.ajoutQueue(val);
        assertFalse("L'élément n'as pa été ajouté",deque.dequeVide());
        assertEquals("L'élément retité n'est pas le bon",val,deque.oterQueue());
    }

    @Test
    @DisplayName("Ajout et retrait de N valeurs")
    void ajouterQueueOterQueueDeuxValeur(){
        int val1 = 8;
        int val2 = 24;
        deque.ajoutQueue(val1);
        deque.ajoutQueue(val2);
        assertFalse("L'élément n'as pa été ajouté",deque.dequeVide());
        assertEquals("L'élément retité n'est pas le bon",val2,deque.oterQueue());
        assertEquals("L'élément retité n'est pas le bon",val1,deque.oterQueue());
        assertTrue("Tous les éléments n'ont pas été retirés",deque.dequeVide());
    }

}
