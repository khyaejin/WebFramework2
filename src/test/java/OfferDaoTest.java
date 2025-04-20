import kr.ac.hansung.cse.dao.OfferDao;
import kr.ac.hansung.cse.model.Offer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/dao-context.xml")

public class OfferDaoTest {

    @Autowired
    private OfferDao offerDao;

    @BeforeEach
    public void setUp() {
        Offer offer = new Offer();
        offer.setName("Test Offer");
        offer.setEmail("test@example.com");
        offer.setText("This is a test offer");

        offerDao.insert(offer);
    }

    @Test
    @DisplayName("Test1: testGetOfferByName")
    public void testGetOfferByName() {
        Offer offer = offerDao.getOffer("Test Offer");
        assertNotNull(offer);
        assertEquals("Test Offer", offer.getName());
    }
}
