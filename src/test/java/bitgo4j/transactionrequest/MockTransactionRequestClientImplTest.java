package bitgo4j.transactionrequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import bitgo4j.BitGo4j;
import bitgo4j.BitGo4jConfig;
import bitgo4j.BitGo4jError;
import bitgo4j.exception.BitGo4jException;
import bitgo4j.transactionrequest.request.CreateTransactionRequestRequest;
import bitgo4j.transactionrequest.request.SignatureShareRequest;
import bitgo4j.transactionrequest.request.UpdateTransactionRequestRequest;
import bitgo4j.transactionrequest.response.ListTransactionRequestResponse;
import bitgo4j.transactionrequest.response.SignatureShareResponse;
import bitgo4j.transactionrequest.response.TransactionRequestResponse;
import bitgo4j.transactionrequest.response.TransferResponse;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockTransactionRequestClientImplTest {
  private static TransactionRequestClientImpl client;

  @BeforeAll
  static void setUp() {
    BitGo4jConfig config = BitGo4jConfig.builder().token("BitGo_API_TOKEN").build();
    BitGo4j.api().initialize(config);
    client = BitGo4j.api().transactionRequest();
  }

  @Test
  void getByEnterpriseTest_200() {
    ListTransactionRequestResponse response =
        client.getByEnterprise(
            "edd670a1a690e6be1b33e836a0f1c59c",
            "",
            0,
            false,
            List.of(""),
            List.of(""),
            List.of(""),
            List.of(""));
    assertNotNull(response);
  }

  @Test
  void getByEnterpriseTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getByEnterprise(
                    "7c9f50377bad6dd6d563e3864b99919b",
                    "",
                    0,
                    false,
                    List.of(""),
                    List.of(""),
                    List.of(""),
                    List.of("")));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "6e4fru44a5wbvpb7vijhs23l2i2qczcpbsmix4b1d8i4uqhar5z5fdbtjj9wuu7v4yhnml1qtwex1809e6yps6kjc3stvcz49bog7feej5d9hrb4zon7ldme4dvfmtavfnx7a83l",
        error.getError());
    assertEquals("707q", error.getRequestId());
    assertEquals("Estefana Sauer", error.getName());
  }

  @Test
  void createTest_200() {
    CreateTransactionRequestRequest request = new CreateTransactionRequestRequest();
    TransactionRequestResponse response =
        client.create("bb39a11fdd0fb349e8b00ab0d4616d26", request);
    assertNotNull(response);
  }

  @Test
  void createTest_201() {
    CreateTransactionRequestRequest request = new CreateTransactionRequestRequest();
    TransactionRequestResponse response =
        client.create("f51a25c110d77b96a9de0d50b0e79554", request);
    assertNotNull(response);
  }

  @Test
  void createTest_400() {
    CreateTransactionRequestRequest request = new CreateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.create("165aa6057a98f5c30763d3b26c3d3399", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "snb5eyxin4sjo2wn0zr5rgyvcegfblonq9omqfgyfluhtjsmafpgxcxlhbzdeb5pxg74r7p21s3gbb",
        error.getError());
    assertEquals("i9io", error.getRequestId());
    assertEquals("Miss Elmira Kozey", error.getName());
  }

  @Test
  void createTest_401() {
    CreateTransactionRequestRequest request = new CreateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.create("2b77171d275bf88f5aa32d6f1bb992ef", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "64z8jnp3wqbsmg7b9o36d8uavk2nxy11vk2uzxglk19tvvlmnx9hov4nvp2xor8n37oa1xup5svwkii0fmdfamrrpjsiz91ecsqgddqfibntk5nlg07993mo6btt463azksckcwknd7yns7irvmfw",
        error.getError());
    assertEquals("l11n", error.getRequestId());
    assertEquals("Tuan Keeling", error.getName());
  }

  @Test
  void createTest_403() {
    CreateTransactionRequestRequest request = new CreateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.create("b98524a41d60e6ace4d9dc70b8f47c15", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "hi94bo7gw5he0b3q9tul8zam0kqmj9xkw9u24zhvelh1337jkgp9111xmel3l0v0zg5v2yafs31dewkrs1ybwpt8q02jy8bta0nbv166cy052uka25zblv3bp",
        error.getError());
    assertEquals("bnls", error.getRequestId());
    assertEquals("Joel Johnston", error.getName());
  }

  @Test
  void createTest_404() {
    CreateTransactionRequestRequest request = new CreateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () -> client.create("8e918a32531a2b37146c4839f023b8eb", request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "uw17bphamzecyuzc4r11thj5j9em2r2xg9909lybl4noc5slzd3ac53jcdl0b5759tqe0qvgh8dxc7yh0bmejgbjl6zl72w7om6gw013ffobdd9dotwrp1kft0cx",
        error.getError());
    assertEquals("628s", error.getRequestId());
    assertEquals("Dr. Merna Luettgen", error.getName());
  }

  @Test
  void getByWalletTest_200() {
    ListTransactionRequestResponse response =
        client.getByWallet(
            "09262f6226fb1f181bc7685da4cc4b0d",
            "",
            0,
            false,
            List.of(""),
            List.of(""),
            List.of(""));
    assertNotNull(response);
  }

  @Test
  void getByWalletTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.getByWallet(
                    "5974bf8095161ad5af4b49316a6b5943",
                    "",
                    0,
                    false,
                    List.of(""),
                    List.of(""),
                    List.of("")));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "8ujuc71mo3bjdauoy85uesmq1r753f3drdw23xmcucm5fa1jok6fvlrlc9vke5pahic9pu4uw8s3k1ffvjuthjru2zcd6tvansmgolrzr3ik8fic5amxskapzjroo30pwcehfun8fkrec1fp8kv13ynpn7jeb9daem4dbanoos7",
        error.getError());
    assertEquals("8x47", error.getRequestId());
    assertEquals("Leandro Shields V", error.getName());
  }

  @Test
  void updateTest_200() {
    UpdateTransactionRequestRequest request = new UpdateTransactionRequestRequest();
    TransactionRequestResponse response =
        client.update(
            "fd56179edf90629d9878a59b19e2051e", "b1c52eaa462f6afd024f084d136b82ec", request);
    assertNotNull(response);
  }

  @Test
  void updateTest_400() {
    UpdateTransactionRequestRequest request = new UpdateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "a91376f38be4a60cc23c52260955d306",
                    "1322b7e7cfc5c6910bed90094658a495",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "63shf8c1ils16wteyujcfnisf3n3wtu0di4qtyprl0oxcbnlb1ayg3hwocqfp5ms5yzatefla48pdtzyjfwxs1ve98pkm32jqajleqetwxasgs0lyjbhv4skjk7vkzifgrc2lk122g8rqu430x99fff95rkcngqrfocitaqg9o1yi85a21p2t7xda5",
        error.getError());
    assertEquals("lf90", error.getRequestId());
    assertEquals("Eda Goyette", error.getName());
  }

  @Test
  void updateTest_401() {
    UpdateTransactionRequestRequest request = new UpdateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "f5f3b55664d733bcc6629081752ee9a8",
                    "2a0f0ded7861367d200d66a3afd3d7c1",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "l534x4cyhhzcl9q5v1n5x1cnuiofg1i44e81xepkgpn7ab3t0aju39mbc8sljdx4g30j76en9r9qt5i2955n5ab2dy8hj7l4atldfhv",
        error.getError());
    assertEquals("268u", error.getRequestId());
    assertEquals("Ike Maggio", error.getName());
  }

  @Test
  void updateTest_403() {
    UpdateTransactionRequestRequest request = new UpdateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "42dd68f47551c7de35e3a01f8ff6cd8a",
                    "c103c46974f0cf9a8421077cc9b20833",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "rk2ktvfubi5srya2qgob3u9txomn36qscqn72or88hs7vd2nx5bq1m9fj005p6ns9j1zi695pnrsnz68gaio8sf08h43ler7kum3xdrpal1j4mq",
        error.getError());
    assertEquals("4399", error.getRequestId());
    assertEquals("Kristine Schiller", error.getName());
  }

  @Test
  void updateTest_404() {
    UpdateTransactionRequestRequest request = new UpdateTransactionRequestRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.update(
                    "9c69bb9d50559027895dc68c64a1b0c5",
                    "29c787f743138dabe6976f7c41f19c4f",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "a66v5pqvynpsng5vblgd1tf30fukwdmzx1xgouoehnnl4ws5dua7ve9j2i78l5zp2wbgtxz9wr0d94vsjpjqqg3yeca5z9la6flnyehgmgcvvvtpq1l1a6m3klsn0kgnxym3665pcq7hgujw9",
        error.getError());
    assertEquals("c193", error.getRequestId());
    assertEquals("Jeannette Hills V", error.getName());
  }

  @Test
  void createSignatureShareForTransactionTest_201() {
    SignatureShareRequest request = new SignatureShareRequest();
    SignatureShareResponse response =
        client.createSignatureShare(
            "efa0f58204b09303ed29ea239c3bfd41", "cafcecbbec25505fa8c4851f386f804c", request);
    assertNotNull(response);
  }

  @Test
  void createSignatureShareForTransactionTest_400() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "28ccec253da9ebb77d38f0e13455f98d",
                    "c79e0b5e715ea8736dc0cea0bb038273",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "ym5svrozz66s8qh8xj74c8xgmgnqkq4854mnrq540xrt3mdhnh6v4n9c8cm5uq4hj3uthqs1x9h703z6yt3dwk83pi32je14wydis2kmuqnlfqho3c6rbcbybffy2h",
        error.getError());
    assertEquals("zx86", error.getRequestId());
    assertEquals("Ms. Melania Dooley", error.getName());
  }

  @Test
  void createSignatureShareForTransactionTest_401() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "e62a39aed3c8b51fe2bbc92b65653b2d",
                    "4f2aa826f3aee5aa5ea689375e05ae64",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "ooafkm7s5l99njemkiw0mpamepypnwrjngzz6g20s4y8dyyjdqtlrmfgvjjfzdhp35pe9eu5wd426ab3d0k6atf2sg735g7zki2gy22ojnv8htah49tdu0pq18zlq8d62booh1g38a86ukcdekhsxg6ej4ug5fv8",
        error.getError());
    assertEquals("40b5", error.getRequestId());
    assertEquals("Suzi Reilly", error.getName());
  }

  @Test
  void createSignatureShareForTransactionTest_403() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "536873292a403690daae3bf4a3022513",
                    "46fc197ba86d86d8a86709834fb81971",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "2y8uocrve11h9d9ipqgk5xe9k05zwrc0d2r0mcytlh3hxnuze893stl8ja0nzxbyd1kkfoy9yntbpq6rhn7lj7rmyox44jodxt4mz2v78aro5rjymtp3odo419g2w4o556exu01nfm8v0u3o2xph611nilpo5mkiuina77tdwf5t",
        error.getError());
    assertEquals("6tz0", error.getRequestId());
    assertEquals("Sharda Erdman", error.getName());
  }

  @Test
  void createSignatureShareForTransactionTest_404() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "fa809af108921f8e07394dafe617e217",
                    "ae56c76fd1fa4c77b65d6c0132dbb219",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "5h3ee7j2cxpsfi8n3gicx3gbbl9v786ky0comtmmy8hsvixbeqb14g2tdsfec8d20m5xh", error.getError());
    assertEquals("6l7z", error.getRequestId());
    assertEquals("Dr. Gala Schoen", error.getName());
  }

  @Test
  void deleteSignatureShareTest_200() {
    List<SignatureShareResponse> response =
        client.deleteSignatureShare(
            "4b8c704c1a7a29a2199b81f0e52555a7", "462d4f9bc757d8a767e480aab484a055");
    assertNotNull(response);
  }

  @Test
  void deleteSignatureShareTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.deleteSignatureShare(
                    "5516bb70ac3f8ab96f92f8fd8ce0bf10", "3f63fa346860998edacafff074fe3eea"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "i62g5vwmdwjvidh6lysxnflwvfv5xhfpk73lwgsfzvx7rqd56vwdc83qxyfl3ilpvb4p29qqif0j8li498wafa30enjr",
        error.getError());
    assertEquals("2z3i", error.getRequestId());
    assertEquals("Octavio Wuckert II", error.getName());
  }

  @Test
  void deleteSignatureShareTest_401() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.deleteSignatureShare(
                    "763a1a5ae94c460b859439aaead5ec58", "380baa95f17ea11dbb5cc21568372047"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("2vpdk6lkehf7qv8nsta3", error.getError());
    assertEquals("mt2t", error.getRequestId());
    assertEquals("Mitsue Sipes PhD", error.getName());
  }

  @Test
  void deleteSignatureShareTest_403() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.deleteSignatureShare(
                    "653332c5898648a628e24ea179719bb8", "ab88263bb4a7d228128785efaf0840cd"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("w041xhk", error.getError());
    assertEquals("o97l", error.getRequestId());
    assertEquals("Royce Nader", error.getName());
  }

  @Test
  void deleteSignatureShareTest_404() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.deleteSignatureShare(
                    "4a1385bc6895c45b384a29112ed8f1e6", "f82be980b08bbf8f05c7260030d88a27"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "mh1u2uc0t5ou1ic0qp3sqhm2f08p9i3463bp0kdvnmarlya9aogdk7sojzc9qmgg0lw67mowjkdixfvlqy31o7i99",
        error.getError());
    assertEquals("v067", error.getRequestId());
    assertEquals("Danial Flatley", error.getName());
  }

  @Test
  void createSignatureShareForTransactionOnTransactionRequestTest_201() {
    SignatureShareRequest request = new SignatureShareRequest();
    SignatureShareResponse response =
        client.createSignatureShare(
            "7c26fbb65b7f4c120c55ddf9be982085",
            "ffa33b7c39a0a8fdf646810c68c4c229",
            "qut22jy9b9lg4erizi",
            request);
    assertNotNull(response);
  }

  @Test
  void createSignatureShareForTransactionOnTransactionRequestTest_400() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "6c892e8c96c99a38022a9369b149e10d",
                    "4ec9bee89f1cd217edd8a5ca987ab6d5",
                    "xwc64z1n2smcd9u59qtv7iu4ep47eb7reje21y4iuvw",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "kq3car06y8t5z0iuijhivr87ka7tthgzq42oyr7palqn7o6umnt40cb468p6708t1mfsmra63tb440",
        error.getError());
    assertEquals("i7y8", error.getRequestId());
    assertEquals("Fausto Krajcik", error.getName());
  }

  @Test
  void createSignatureShareForTransactionOnTransactionRequestTest_401() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "7f4fff1f7c588f014d83fc391f27e684",
                    "a98480293dd13c2cdcb5dd45610762a1",
                    "s5bym9d66q0a76b7s4aj9zo5zlalfez7locwa38t2qt4gkjrv6vw1u8rmp6282qmn6nokcejq12ytiwzbkpt6par5pc97jq08cc09vi5w3ici7nnatn0gd74mamja5501xziogqjq8waykb036sz9hvjqjqi3l0veowwusz0l8eolsxyd3io",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "nuoxgmvhsukv7qvg8q0h3nwvhh404896oz9gqeyegrh6i8likbl8w2o4q08ukinssff0r5xz0hpismkd5zayl32oqdp0smoy8n3hl97awr77ox8rc3265uz39t6uy98871dq4",
        error.getError());
    assertEquals("iou7", error.getRequestId());
    assertEquals("Valentine Emard", error.getName());
  }

  @Test
  void createSignatureShareForTransactionOnTransactionRequestTest_403() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "7b6b2d87f9f055c2a6c3f7d05f6d8894",
                    "f3222834232c8e4980ca68970c92f84c",
                    "3iqf3tu80gjd03oz4fquda6lho2fc3qs30ldyjbvqxn1qtml7gzl4yipwe4p2qoqipk2yqr2uij3app8pipw1qwzpnzc4e1num28izkxucgj3dhsoewmp9jopbxjl2d7iiro3688fqdet892p480s5dr55eb6kvruas99zrv21u459r4",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals("p0484cv0wvsdxlp4bxnajmo4icd5nox", error.getError());
    assertEquals("i4x2", error.getRequestId());
    assertEquals("Yen Lockman", error.getName());
  }

  @Test
  void createSignatureShareForTransactionOnTransactionRequestTest_404() {
    SignatureShareRequest request = new SignatureShareRequest();
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createSignatureShare(
                    "111ac54d5641a8bd3436b6a5ba106c9b",
                    "9911e74a456caf9a9d6c9b074f0f936d",
                    "y4aswl8tbgzl2go43kql8yg8jcz9r",
                    request));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "hb57db310ui3vsi1725lmxgql9wkli2ypg64rc7cxfk38h7ocz7mub9dxxbvk7gjjxhi6cd7vq5ynb31n24r56u128vv0g4sxoii2guda318sezf956v30nv64czky9cbb18golwca4z4efp5yrvhe9uibagw8ke7k",
        error.getError());
    assertEquals("hs8l", error.getRequestId());
    assertEquals("Man Hermiston", error.getName());
  }

  @Test
  void createTransferResponseTest_200() {
    TransferResponse response =
        client.createTransferResponse(
            "31bea4fe6e85809fd9fd425634589e68", "752d33c52b7b2d83a7e5772eaebf46ee");
    assertNotNull(response);
  }

  @Test
  void createTransferResponseTest_400() {
    BitGo4jException exception =
        assertThrows(
            BitGo4jException.class,
            () ->
                client.createTransferResponse(
                    "f96d6182a1ad59a7f09e1765c2a903c6", "45467485e842fe43b04b37912e3a9515"));
    assertNotNull(exception);

    BitGo4jError error = exception.getError();
    assertEquals(
        "k1498pjgnv8ek0cfzgjwgwftl63t8ydiux6celswm1yd4xsv8p20ui0oc9giftomb9iy43eo7gr1m36otqc26vjqk51",
        error.getError());
    assertEquals("7aaf", error.getRequestId());
    assertEquals("Otis Braun", error.getName());
  }
}
