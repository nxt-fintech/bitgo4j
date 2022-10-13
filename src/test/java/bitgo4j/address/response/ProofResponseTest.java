package bitgo4j.address.response;

import bitgo4j.address.common.AuxProofData;
import bitgo4j.address.common.Data;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProofResponseTest {
  @Mock List<AuxProofData> auxProofData;

  @InjectMocks ProofResponse proofResponse;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = proofResponse.toString();
    Assertions.assertEquals(
        "ProofResponse[address=<null>,chain=<null>,iou=<null>,signature=<null>,prefix=<null>,proofType=<null>,auxProofData=auxProofData]",
        result);
  }

  @Test
  void testSetAddress() {
    proofResponse.setAddress("address");
  }

  @Test
  void testSetChain() {
    proofResponse.setChain("chain");
  }

  @Test
  void testSetIou() {
    proofResponse.setIou(Boolean.TRUE);
  }

  @Test
  void testSetSignature() {
    proofResponse.setSignature("signature");
  }

  @Test
  void testSetPrefix() {
    proofResponse.setPrefix("prefix");
  }

  @Test
  void testSetProofType() {
    proofResponse.setProofType("proofType");
  }

  @Test
  void testSetAuxProofData() {
    proofResponse.setAuxProofData(List.of(new AuxProofData("type", new Data("script"))));
  }
}
