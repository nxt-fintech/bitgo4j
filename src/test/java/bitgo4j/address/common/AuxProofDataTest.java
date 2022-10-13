package bitgo4j.address.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AuxProofDataTest {
  @Mock Data data;

  @InjectMocks AuxProofData auxProofData;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = auxProofData.toString();
    Assertions.assertEquals("AuxProofData[type=<null>,data=data]", result);
  }

  @Test
  void testSetType() {
    auxProofData.setType("type");
  }

  @Test
  void testSetData() {
    auxProofData.setData(new Data("script"));
  }
}
