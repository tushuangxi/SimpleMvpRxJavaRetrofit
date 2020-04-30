package com.lding.tshyserial.simplemvprxjavaretrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetListRsp  implements Serializable {


    /**
     * female : [{"bookCount":598510,"monthlyCount":15487,"name":"古代言情","icon":"/icon/古代言情_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2045755%2F2045755_d19a460229b148d4b6a09fd38e70c90f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2240690%2F2240690_9492d2ce8a6949c584baf01f36add8cb.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1158081%2F1158081_0340c4bbf5c144c885a089d96714753d.jpg%2F"]},{"bookCount":748463,"monthlyCount":22379,"name":"现代言情","icon":"/icon/现代言情_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2148350%2F2148350_934ff2b4b6d14bd7949be61df7eed913.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F84550%2F84550_faeb57b6f3e04b36a31e6b9d4708eee9.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2031369%2F2031369_0f23d7cf17d448dbb444459e4d41dfba.jpg%2F"]},{"bookCount":151938,"monthlyCount":2797,"name":"青春校园","icon":"/icon/青春校园_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2279091%2F2279091_9ad0367ced944ec5b1e0c1c96a11fab6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1200747%2F1200747_8acedaa3e7a547a8843feca07120b2c9.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3345845%2F3345845_9bd38b2656f14c51b1db8b72d25d2981.jpg%2F"]},{"bookCount":130456,"monthlyCount":294,"name":"纯爱","icon":"/icon/耽美_.png","bookCover":["/agent/http://ww2.sinaimg.cn/mw690/ed992597gw1ey1euf3n00j20f00k0wg9.jpg","/agent/http://static.jjwxc.net/backend/novelimage.php?novelid=1815278","/agent/http://ww4.sinaimg.cn/mw690/75c59006gw1evpv9lcs5jj205k07s40b.jpg"]},{"bookCount":164886,"monthlyCount":876,"name":"玄幻奇幻","icon":"/icon/玄幻奇幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42127%2F42127_535fb7f131f847f59c498d5d6e85314a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1240992%2F1240992_c216f596e85d430c8e9ba7bda5094958.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F863875%2F863875_7ed47c41ed2f482388e47017ac811a1a.jpg%2F"]},{"bookCount":81700,"monthlyCount":1836,"name":"武侠仙侠","icon":"/icon/武侠仙侠_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2238871%2F2238871_6bc7ecde28084a0c984a2cbd5d1b61ed.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2282012%2F2282012_216dd1f93a414b5e9df531d05497bdb9.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2252401%2F2252401_e5a1f6b66b1a4487ae43ad94a043ce7d.jpg%2F"]},{"bookCount":19552,"monthlyCount":544,"name":"科幻","icon":"/icon/科幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2207711%2F2207711_524c81ce00b74c508dcb8fa7cac18c75.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2189051%2F2189051_3531d35fe6d44414afb80aa8d7d4c10c.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1043486%2F1043486_9d69d496ecb34ae5a2c6b00938998520.jpg%2F"]},{"bookCount":6799,"monthlyCount":3,"name":"游戏竞技","icon":"/icon/游戏竞技_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2988885%2F2988885_5f38079f513a47f6aa996bfccf4b56c6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2908738%2F2908738_964840284be24a3bb781e1c35c1cbc4a.jpg%2F"]},{"bookCount":21771,"monthlyCount":1267,"name":"悬疑灵异","icon":"/icon/悬疑灵异_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F58330%2F58330_566448d7ef8d432c99623aca75bb549a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3345347%2F3345347_dde1afa03b444e0f905bf821c32fce15.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2315588%2F2315588_c036af9c446345d09b1451963ba92ece.jpg%2F"]},{"bookCount":121127,"monthlyCount":325,"name":"同人","icon":"/icon/同人_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3341946%2F3341946_922b413873ca4def928483c80a4bda5d.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3341472%2F3341472_bb8ee79497c04893a53c85679b51d2db.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3341718%2F3341718_576afc63bbf54ac5888e15ca2f43929b.jpg%2F"]},{"bookCount":23262,"monthlyCount":1505,"name":"女尊","icon":"/icon/女尊_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F851414%2F851414_429eb55442d34b8dacb662a2f1448b1f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2241654%2F2241654_11048c27e82640239f7b81df688976c0.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F857217%2F857217_fe22d6332f7b4ac3ad58871f750b2938.jpg%2F"]},{"bookCount":26582,"monthlyCount":34,"name":"莉莉","icon":"/icon/百合_.png","bookCover":["/agent/http://ww1.sinaimg.cn/bmiddle/005K5T3Ogw1ezekp64o88j30b40fk3zd.jpg","/agent/http://static.jjwxc.net/images/default_cover.gif","/agent/http://ww3.sinaimg.cn/thumbnail/d12bebacgw1f19gbz8qntj20jg0rhgq6.jpg"]}]
     * press : [{"bookCount":8302,"monthlyCount":494,"name":"传记名著","icon":"/icon/传记名著_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2281875%2F2281875_db2c743f0d8d41eca45c46528d876b54.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42798%2F42798_72627be42841400d89e32bf8db97ec34.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1209327%2F1209327_fd3412af2a534a3eb970432860e1d2bc.jpg%2F"]},{"bookCount":22208,"monthlyCount":1750,"name":"出版小说","icon":"/icon/出版小说_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3353013%2F3353013_bd454528a5ca4a12a9995d3400f8467a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F49094%2F49094_ee758732d3ee4c8196005dbb9e036c93.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F55056%2F_55056_260551.jpg%2F"]},{"bookCount":98332,"monthlyCount":8034,"name":"人文社科","icon":"/icon/人文社科_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2091345%2F2091345_ce970393505c4dedab190e77344c5911_default_cover.png%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2063781%2F2063781_205eb9c15cac4d6b90673242c5242c28.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F739278%2F_739278_424928.jpg%2F"]},{"bookCount":3545,"monthlyCount":166,"name":"生活时尚","icon":"/icon/生活时尚_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2063886%2F2063886_ee5c3b3bb2cc4332a319c05adea1753f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1529069%2F_1529069_328412.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1061633%2F_1061633_813851.jpg%2F"]},{"bookCount":7561,"monthlyCount":653,"name":"经管理财","icon":"/icon/经管理财_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F525146%2F_525146_570253.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F561611%2F_561611_580347.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F589633%2F_589633_280231.jpg%2F"]},{"bookCount":20138,"monthlyCount":2075,"name":"青春言情","icon":"/icon/青春言情_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2202149%2F2202149_ab670bc133bb44d9a83264284a97a8bd.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2592744%2F2592744_aa1418aa24e4447bb265f5e62114086f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2040550%2F2040550_d57792a2dae34abd9f96fdc993be6cc3.jpg%2F"]},{"bookCount":2542,"monthlyCount":163,"name":"外文原版","icon":"/icon/外文原版_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1418472%2F1418472_899613577e6a4e31be3e296810a9dc37.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F30499%2F_30499_931628.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1418565%2F_1418565_480851.jpg%2F"]},{"bookCount":801,"monthlyCount":52,"name":"政治军事","icon":"/icon/政治军事_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F67353%2F_67353_379538.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F705824%2F_705824_738579.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F503414%2F_503414_670875.jpg%2F"]},{"bookCount":17843,"monthlyCount":1503,"name":"成功励志","icon":"/icon/成功励志_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F577424%2F577424_0414241d5b264c2d9c8787d554a58f63.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1148271%2F_1148271_859550.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F858627%2F_858627_838818.jpg%2F"]},{"bookCount":15416,"monthlyCount":1330,"name":"育儿健康","icon":"/icon/育儿健康_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2252004%2F2252004_02add182cd964e2eb5eb70c6e8f3ecb6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2077896%2F2077896_9d45c4efb5734688a31efd793c5cdeb1.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2076541%2F2076541_5b47030068a645b6982dd13be94abffa.jpg%2F"]}]
     * ok : true
     * male : [{"bookCount":578083,"monthlyCount":21628,"name":"玄幻","icon":"/icon/玄幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1228859%2F1228859_b7114fbfc2a44969ac2879fcec1d6bea.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2107590%2F2107590_2607eaf03b2542ba88e4b75ac96bb12c.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F41584%2F41584_873f1d8b2f7a447a8c59f3573094db1b.jpg%2F"]},{"bookCount":63389,"monthlyCount":2064,"name":"奇幻","icon":"/icon/奇幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2328044%2F2328044_3077a625538f4ef29384ba71e7387736.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1130743%2F1130743_42e9200c279a48b7a31001d363ba401c.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3323195%2F3323195_3adb5b3698f9456182aeb5d3bb7bfae8.jpg%2F"]},{"bookCount":49482,"monthlyCount":1612,"name":"武侠","icon":"/icon/武侠_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F682805%2F682805_ee8c8eadfc544cfd8e71b8557e4ec702.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2405551%2F2405551_dabab34955ec411c8fe3dfb445cc7c21.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F994219%2F994219_ce96bc56ab3342319224bf5ecffe4a2f.jpg%2F"]},{"bookCount":157089,"monthlyCount":7219,"name":"仙侠","icon":"/icon/仙侠_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2014980%2F2014980_4886fb1ed53f453a9a76005611a3310a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2126166%2F2126166_c1002339e5664d7bb1a536e2608fa599.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2371607%2F2371607_cec031f8a2fc46fda009f72e570f9486.jpg%2F"]},{"bookCount":396205,"monthlyCount":16946,"name":"都市","icon":"/icon/都市_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F857368%2F857368_8428516582234635819871b0dd5862e7.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2405734%2F2405734_1de7404a86714704a9494f21ceddc1ba.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2232206%2F2232206_bac5f7460cfc4e25aaefe1521fe44b19.jpg%2F"]},{"bookCount":18512,"monthlyCount":909,"name":"职场","icon":"/icon/职场_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2324039%2F2324039_c8676697c9324ff6a32b23b0f2813bca.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3320930%2F3320930_6484a7db64bc47ccb2dcd00e75f80638.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1466377%2F1466377_5b35c940dfa2460f9a52b8ba7ee22e1d.jpg%2F"]},{"bookCount":80738,"monthlyCount":2808,"name":"历史","icon":"/icon/历史_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2326717%2F2326717_fa135a1044fa4602854e9cbe2f0663d5.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2371361%2F2371361_7deb47a053ce4fc0a3f7e42ae72cf4d3.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2078199%2F2078199_242a8ffcc41a4482b150ea28aa962c92.jpg%2F"]},{"bookCount":17185,"monthlyCount":758,"name":"军事","icon":"/icon/军事_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2405465%2F2405465_f5af4826bd8d4fbca23e64c0d1a22fa7.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2266163%2F2266163_7ffd0ca6a6544f5f90a557478d325ef3.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2148267%2F2148267_40af459331ce49bab4ef2d79ecd8c412.jpg%2F"]},{"bookCount":91078,"monthlyCount":2515,"name":"游戏","icon":"/icon/游戏_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2044454%2F2044454_5ca42e40354d4b898fa81d953a56320b.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2194747%2F2194747_b15f4efee26647bab7c7bbdb654da586.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2223994%2F2223994_9b7cd30b0025437c9bfa3bba2b6c575b.jpg%2F"]},{"bookCount":6744,"monthlyCount":357,"name":"竞技","icon":"/icon/竞技_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3321007%2F3321007_1e523221439b4c9688c336de4abd00c7.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2406312%2F2406312_51d09a6f10a44dcf82c87336ae29bcc2.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2666276%2F2666276_0a1836381893480f8191fd5abea07a27.jpg%2F"]},{"bookCount":133995,"monthlyCount":2709,"name":"科幻","icon":"/icon/科幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2852164%2F2852164_57f5cdebfbb84d81909d30041c573d94.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2280410%2F2280410_972b063c4024437db50d489a84a428b3.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3333767%2F3333767_5bc79692e0bb44d59103fce8d533e532.jpg%2F"]},{"bookCount":54589,"monthlyCount":5385,"name":"灵异","icon":"/icon/灵异_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2437722%2F2437722_0ae1b0af1e4643829952042800e879c5.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2225869%2F2225869_fbfd4ee3058f4c3ca6158395349eafb3.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2190222%2F2190222_35193469a0ab4198b58e13ec34d49b47.jpg%2F"]},{"bookCount":46948,"monthlyCount":441,"name":"同人","icon":"/icon/同人_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2044717%2F2044717_052c728329a740058af75fe5f81bf307.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1518279%2F1518279_f75d8d0662ba4fb18224be37cd75621c.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3317544%2F3317544_ead6b5e651604ad3b442cdcbd08e1993.jpg%2F"]},{"bookCount":9782,"monthlyCount":390,"name":"轻小说","icon":"/icon/轻小说_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2148576%2F2148576_626b71c9e87143c7920ef7188e45c7e7.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2129097%2F2129097_3ee0a9f599a844d3ba6db607dffa5c2e.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3341965%2F3341965_b9b2de87935c4153ab308bdd663d7934.jpg%2F"]}]
     * picture : [{"bookCount":899,"monthlyCount":149,"name":"热血","icon":"/icon/热血_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F168407%2F168407_749f2be713ea464193b3b4d8e314e00a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F181576%2F181576_db9f64dc8f2e4080a202f46f986cdbad.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F168458%2F168458_51b101f968b547b29eba9e470147a345.jpg%2F"]},{"bookCount":405,"monthlyCount":57,"name":"魔幻","icon":"/icon/魔幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2225868%2F2225868_d6fb403eff2e407bbf1a2d43b7c85438.png%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2225787%2F2225787_b75c7142b03e445898b3079c73859fce.png%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3333201%2F3333201_2dde963808ea400da4fc122e563cad3e.png%2F"]},{"bookCount":24,"monthlyCount":0,"name":"科幻","icon":"/icon/科幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F149517%2F0cbbc5b49903426b8b9e3d9ee5318fb0.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2193917%2F2193917_e23cb3d30be34ec1be419747f3b7c53a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F195515%2F195515_b8f4e7f66e604c4293fcc462f048a948.jpg%2F"]},{"bookCount":1302,"monthlyCount":199,"name":"恋爱","icon":"/icon/恋爱_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3312272%2F3312272_69c2db2a04a8482686202df987225e45.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2618977%2F2618977_eb83e797388249769d17983e425e3d2e.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3316877%2F3316877_9f4f7ff28c614f9da55d6b220f59703e.jpg%2F"]},{"bookCount":1305,"monthlyCount":88,"name":"搞笑","icon":"/icon/搞笑_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2185190%2F2185190_02b51397c05d48b1baefd51fcaaa6023.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F173734%2F173734_c6d2e07448574d86801f1ad97b39aa24.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2599652%2F2599652_81eeb5cedc3043f99d92d06fdd530c93.png%2F"]},{"bookCount":473,"monthlyCount":103,"name":"悬疑","icon":"/icon/悬疑_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3343646%2F3343646_a3403adcab3e4134abd985cba152da0a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2594800%2F2594800_6219a1a074484faa9e4101830ae690d8.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F3343243%2F3343243_28303e25ddf94472b07579fdaa4553ef.jpg%2F"]},{"bookCount":4552,"monthlyCount":1577,"name":"少儿","icon":"/icon/少儿_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F191816%2F180732f541614d2ab0bebd778516aae6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F197939%2Fff8713cfd9cd4893a49db3564d3811e4.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2079559%2F2079559_69f74d5ee39a400b84581d668d7641ad.jpg%2F"]}]
     */
//    @SerializedName("female")
    private List<FemaleEntity> female;
    private List<PressEntity> press;
    private boolean ok;
    private List<MaleEntity> male;
    private List<PictureEntity> picture;

    public void setFemale(List<FemaleEntity> female) {
        this.female = female;
    }

    public void setPress(List<PressEntity> press) {
        this.press = press;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setMale(List<MaleEntity> male) {
        this.male = male;
    }

    public void setPicture(List<PictureEntity> picture) {
        this.picture = picture;
    }

    public List<FemaleEntity> getFemale() {
        return female;
    }

    public List<PressEntity> getPress() {
        return press;
    }

    public boolean isOk() {
        return ok;
    }

    public List<MaleEntity> getMale() {
        return male;
    }

    public List<PictureEntity> getPicture() {
        return picture;
    }

    public class FemaleEntity {
        /**
         * bookCount : 598510
         * monthlyCount : 15487
         * name : 古代言情
         * icon : /icon/古代言情_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2045755%2F2045755_d19a460229b148d4b6a09fd38e70c90f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2240690%2F2240690_9492d2ce8a6949c584baf01f36add8cb.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1158081%2F1158081_0340c4bbf5c144c885a089d96714753d.jpg%2F"]
         */
        private int bookCount;
        private int monthlyCount;
        private String name;
        private String icon;
        private List<String> bookCover;

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }

        public int getBookCount() {
            return bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public String getName() {
            return name;
        }

        public String getIcon() {
            return icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }
    }

    public class PressEntity {
        /**
         * bookCount : 8302
         * monthlyCount : 494
         * name : 传记名著
         * icon : /icon/传记名著_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2281875%2F2281875_db2c743f0d8d41eca45c46528d876b54.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42798%2F42798_72627be42841400d89e32bf8db97ec34.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1209327%2F1209327_fd3412af2a534a3eb970432860e1d2bc.jpg%2F"]
         */
        private int bookCount;
        private int monthlyCount;
        private String name;
        private String icon;
        private List<String> bookCover;

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }

        public int getBookCount() {
            return bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public String getName() {
            return name;
        }

        public String getIcon() {
            return icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }
    }

    public class MaleEntity {
        /**
         * bookCount : 578083
         * monthlyCount : 21628
         * name : 玄幻
         * icon : /icon/玄幻_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1228859%2F1228859_b7114fbfc2a44969ac2879fcec1d6bea.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2107590%2F2107590_2607eaf03b2542ba88e4b75ac96bb12c.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F41584%2F41584_873f1d8b2f7a447a8c59f3573094db1b.jpg%2F"]
         */
        private int bookCount;
        private int monthlyCount;
        private String name;
        private String icon;
        private List<String> bookCover;

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }

        public int getBookCount() {
            return bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public String getName() {
            return name;
        }

        public String getIcon() {
            return icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }
    }

    public class PictureEntity {
        /**
         * bookCount : 899
         * monthlyCount : 149
         * name : 热血
         * icon : /icon/热血_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F168407%2F168407_749f2be713ea464193b3b4d8e314e00a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F181576%2F181576_db9f64dc8f2e4080a202f46f986cdbad.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F168458%2F168458_51b101f968b547b29eba9e470147a345.jpg%2F"]
         */
        private int bookCount;
        private int monthlyCount;
        private String name;
        private String icon;
        private List<String> bookCover;

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }

        public int getBookCount() {
            return bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public String getName() {
            return name;
        }

        public String getIcon() {
            return icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }
    }



    //---------------------------------------------
/*
    *//**
     * male : [{"name":"玄幻","bookCount":514683,"monthlyCount":21366,"icon":"/icon/玄幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1228859%2F_1228859_441552.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F891697%2F_891697_378164.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F41584%2F_41584_123902.jpg%2F"]},{"name":"奇幻","bookCount":49774,"monthlyCount":2077,"icon":"/icon/奇幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1130743%2F_1130743_505316.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2230412%2F2230412_378f83347e304b10ba6c36a12b434a7b.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F713823%2F_713823_841716.jpg%2F"]},{"name":"武侠","bookCount":42693,"monthlyCount":1619,"icon":"/icon/武侠_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F682805%2F_682805_516722.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2219099%2F2219099_923da06a1a3e4d3ebd775e6264b18c59.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2194747%2F2194747_cbb7d4e028cb467e9fdd290a92e0a259.jpg%2F"]},{"name":"仙侠","bookCount":138121,"monthlyCount":7469,"icon":"/icon/仙侠_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1188355%2F_1188355_363695.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F682770%2F682770_abddc02117024aacb4ae3299cab3eb95.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2014980%2F2014980_bbbc3ba8b18646d09278e03f2a6dcaca.jpg%2F"]},{"name":"都市","bookCount":361097,"monthlyCount":14151,"icon":"/icon/都市_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F857368%2F857368_c92c5211a6504e0889fb1c09dcf4ce06.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F683354%2F_683354_716237.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2078208%2F2078208_b5931e0074c542608ef38c2ba0d961d7.jpg%2F"]},{"name":"职场","bookCount":16537,"monthlyCount":832,"icon":"/icon/职场_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2080563%2F2080563_7ff8c11c387b4517b57a311e57bd5407.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1159594%2F_1159594_169195.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1466377%2F_1466377_886541.jpg%2F"]},{"name":"历史","bookCount":72238,"monthlyCount":2851,"icon":"/icon/历史_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1314571%2F_1314571_289295.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1127342%2F_1127342_276630.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F634346%2F_634346_106373.jpg%2F"]},{"name":"军事","bookCount":15413,"monthlyCount":1291,"icon":"/icon/军事_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2194052%2F2194052_5831cda813fb4c758b90f2fc3ac20227.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1367432%2F_1367432_658946.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1164563%2F_1164563_951629.jpg%2F"]},{"name":"游戏","bookCount":82044,"monthlyCount":2383,"icon":"/icon/游戏_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2044454%2F2044454_75533bb1fdd94ea199c25abb2cd65985.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2208312%2F2208312_8e68612833784d6ca6e0b1875084dec2.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2202011%2F2202011_c9f4689365524bb1956d73fc3d9ab10c.jpg%2F"]},{"name":"竞技","bookCount":5877,"monthlyCount":361,"icon":"/icon/竞技_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1478042%2F_1478042_857319.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2096246%2F2096246_4e55a0850e6b46b385ec4b302b82b8fa.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1312764%2F_1312764_438601.jpg%2F"]},{"name":"科幻","bookCount":119885,"monthlyCount":2577,"icon":"/icon/科幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2185681%2F2185681_40c9ddb71b0048c394cf58df0dfca732.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2162481%2F2162481_94f413b58701406bbcb49d38bcd45e15.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1169779%2F_1169779_955701.jpg%2F"]},{"name":"灵异","bookCount":41914,"monthlyCount":4490,"icon":"/icon/灵异_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2190222%2F2190222_e20dc28831714bf8a67401e414f8d425.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2225869%2F2225869_20e952434e3d4ba2a3db22a71837d8b5.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1496497%2F_1496497_188071.jpg%2F"]},{"name":"同人","bookCount":40535,"monthlyCount":286,"icon":"/icon/同人_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1518279%2F_1518279_096405.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2213453%2F2213453_e5bfe0f131d446069e536497d896fb85.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2044717%2F2044717_87093d361a4b483896b61fd55f8a2a28.jpg%2F"]},{"name":"轻小说","bookCount":5048,"monthlyCount":335,"icon":"/icon/轻小说_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1494992%2F_1494992_119116.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2243879%2F2243879_94ff33910679471bb8060ad1c54663c6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2206001%2F2206001_c7c857a454ec4a4b9ae4b5637f863a7e.jpg%2F"]}]
     * female : [{"name":"古代言情","bookCount":474997,"monthlyCount":11803,"icon":"/icon/古代言情_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2143521%2F2143521_083a5ac565cd458f9b84fcb88adf33fb.png%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1362823%2F_1362823_256513.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1505754%2F_1505754_955413.jpg%2F"]},{"name":"现代言情","bookCount":609275,"monthlyCount":17984,"icon":"/icon/现代言情_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F84550%2F84550_8767d46cd8e44064b51b4efd6ae08c2e.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2148350%2F2148350_b0ad169278c44027babf1b0aa1d8eabb.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1367041%2F_1367041_461002.jpg%2F"]},{"name":"青春校园","bookCount":116842,"monthlyCount":2874,"icon":"/icon/青春校园_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1200747%2F1200747_7f02bffa6b0b47889293ebc613d883ff.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1131279%2F_1131279_024701.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2207688%2F2207688_69a480b0c8924f16be9bf1b1a880ecc0.jpg%2F"]},{"name":"纯爱","bookCount":133668,"monthlyCount":1443,"icon":"/icon/耽美_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1174497%2F_1174497_618871.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F67324%2F_67324_158064.jpg%2F","/agent/http://ww2.sinaimg.cn/mw690/ed992597gw1ey1euf3n00j20f00k0wg9.jpg"]},{"name":"玄幻奇幻","bookCount":131234,"monthlyCount":662,"icon":"/icon/玄幻奇幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42127%2F42127_765ca130f8d340558a87e2d5f1fc1301.png%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2045755%2F2045755_7a7a750f61f64703977e72cca5c8dc90.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2194067%2F2194067_c764cc59d729466e9d505fa33789b58a.jpg%2F"]},{"name":"武侠仙侠","bookCount":64772,"monthlyCount":1586,"icon":"/icon/武侠仙侠_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2143666%2F2143666_9bea767b345e4bf793060937af6a4c5f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F44329%2F_44329_593234.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1187773%2F_1187773_659828.jpg%2F"]},{"name":"科幻","bookCount":10636,"monthlyCount":475,"icon":"/icon/科幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2175669%2F2175669_f7a71b481eb647d3978b8cceb1fe52e1.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2020880%2F2020880_9aa14120a38e4e34bfa1cf51920c17a1.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2207711%2F2207711_524c81ce00b74c508dcb8fa7cac18c75.jpg%2F"]},{"name":"游戏竞技","bookCount":6677,"monthlyCount":139,"icon":"/icon/游戏竞技_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42014%2F_42014_918695.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F74250%2F74250_eb225d07b43b48a38623bf7817e0fde7.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2182694%2F2182694_610b00f6aa5b4dc888c266fee46d711b.jpg%2F"]},{"name":"悬疑灵异","bookCount":14181,"monthlyCount":714,"icon":"/icon/悬疑灵异_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1457026%2F_1457026_237840.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1267576%2F_1267576_273302.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F58330%2F58330_885b2bcace1740d18c680880dd9bbff7.jpg%2F"]},{"name":"同人","bookCount":118596,"monthlyCount":200,"icon":"/icon/同人_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2182241%2F2182241_252c8b2f0302468abe96aabde683c640.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2182242%2F2182242_418232fc41054c1f91f0a36b8aae6f2a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2175881%2F2175881_3d3307249df5460ebf254edd6e5f3e2b.jpg%2F"]},{"name":"女尊","bookCount":20840,"monthlyCount":1080,"icon":"/icon/女尊_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F851414%2F_851414_740896.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F857217%2F857217_34eea5a4425d4437896b19d2774ac5da.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2148904%2F2148904_418eb43d34aa479087d8092720446b2b.jpg%2F"]},{"name":"莉莉","bookCount":25956,"monthlyCount":81,"icon":"/icon/百合_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2190309%2F2190309_78c7346877924b62a260fb1fc09228fd.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2190667%2F2190667_0bfcccfc6c264980aada08c1b36762b6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2190689%2F2190689_9ba615979d174cc1995afda9afe078d4.jpg%2F"]}]
     * picture : [{"name":"热血","bookCount":720,"monthlyCount":114,"icon":"/icon/热血_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F194607%2F194607_72270909242745fd83336e39b251e874.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F182350%2F41eb45e4c2e740a69140be391ad7cb4a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F187647%2F187647_6275adb20b7248e487b4162d07911a6d.jpg%2F"]},{"name":"魔幻","bookCount":525,"monthlyCount":122,"icon":"/icon/魔幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F168407%2F168407_d1492388cfdc4f4c974bc503939edff0.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F184162%2F184162_33ed57ff61704076bfd487393623103b.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F166465%2F166465_5af02a7135da402abd9d4138b3bfa42f.jpg%2F"]},{"name":"科幻","bookCount":76,"monthlyCount":11,"icon":"/icon/科幻_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F195759%2F195759_26346998ba4b48e38127aa7d44d96586.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F193264%2F193264_eed196c5293543ff85a1812e59772abd.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F176272%2F176272_c231f6803b0040a48dda7b21a73e7629.jpg%2F"]},{"name":"恋爱","bookCount":1340,"monthlyCount":237,"icon":"/icon/恋爱_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2021320%2F2021320_dd612b7c03794c00a385f8d95ee56a4e.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F180377%2F180377_7cc9d58141574542bace87325ceb19a6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2191154%2F2191154_b83b6f631cb2462096d7bd4fa36188bf.jpg%2F"]},{"name":"搞笑","bookCount":1747,"monthlyCount":158,"icon":"/icon/搞笑_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2021717%2F2021717_b9c8d4bfbcdb4c649b7cce9478efbb94.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2185190%2F2185190_02b51397c05d48b1baefd51fcaaa6023.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2205236%2F2205236_7147872c63624b009128a06e481d2039.jpg%2F"]},{"name":"悬疑","bookCount":338,"monthlyCount":73,"icon":"/icon/悬疑_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F180667%2F180667_71d180052a4341558cad79e1d67d7be9.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F191033%2F191033_496b5f1507b9410e8d05e8c2edaa3b49.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F167573%2F167573_5ced5851fd144fcdb226e18274e0a430.jpg%2F"]},{"name":"少儿","bookCount":3376,"monthlyCount":1507,"icon":"/icon/少儿_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F196173%2F4feec11cc5374667b58c4d2ea4cc095a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F189090%2F7839c7161b544d40b492627281e70492.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F177704%2F9b8c606f4c30403189731ae11660f441.jpg%2F"]}]
     * press : [{"name":"传记名著","bookCount":5026,"monthlyCount":1528,"icon":"/icon/传记名著_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F30771%2F_30771_973261.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42798%2F_42798_755444.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F53598%2F_53598_122310.jpg%2F"]},{"name":"出版小说","bookCount":13273,"monthlyCount":3438,"icon":"/icon/出版小说_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2202149%2F2202149_4c108c40f4264a4089e977b1830c5a40.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F41574%2F_41574_081848.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F685582%2F_685582_433326.jpg%2F"]},{"name":"人文社科","bookCount":63312,"monthlyCount":13923,"icon":"/icon/人文社科_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2053642%2F2053642_1675460130664e3295282eeea531f0b9.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1175601%2F_1175601_339438.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2091345%2F2091345_default_cover.png%2F"]},{"name":"生活时尚","bookCount":2915,"monthlyCount":537,"icon":"/icon/生活时尚_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2063886%2F2063886_ee5c3b3bb2cc4332a319c05adea1753f.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2186830%2F2186830_52ad3a388ff14adca060f232526d4227.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1529069%2F_1529069_328412.jpg%2F"]},{"name":"经管理财","bookCount":5482,"monthlyCount":1727,"icon":"/icon/经管理财_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F19087%2F_19087_732103.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F34695%2F_34695_083305.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2111603%2F2111603_default_cover.png%2F"]},{"name":"青春言情","bookCount":12199,"monthlyCount":2063,"icon":"/icon/青春言情_.png","bookCover":["/cover/152151126559339","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1419744%2F_1419744_418690.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2144003%2F2144003_0ce9ce7d451c467990617050122914c7.jpg%2F"]},{"name":"外文原版","bookCount":1400,"monthlyCount":423,"icon":"/icon/外文原版_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2022998%2F2022998_17ff5053c0344d5db5c892fbd4d9dde6.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42735%2F_42735_042736.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1418090%2F_1418090_647350.jpg%2F"]},{"name":"政治军事","bookCount":740,"monthlyCount":263,"icon":"/icon/政治军事_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F685458%2F_685458_619168.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F685334%2F_685334_174607.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2043686%2F2043686_f6d7f4a2769245648754943037d2e9aa.jpg%2F"]},{"name":"成功励志","bookCount":11103,"monthlyCount":2765,"icon":"/icon/成功励志_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F577424%2F_577424_901386.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1522490%2F_1522490_091877.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F858627%2F_858627_838818.jpg%2F"]},{"name":"育儿健康","bookCount":11655,"monthlyCount":2740,"icon":"/icon/育儿健康_.png","bookCover":["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2154248%2F2154248_51181588edee4bef8d794a534442fc2d.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2041720%2F2041720_e3a7cf609777415fba8cfc91b3a87e28.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1371877%2F_1371877_559378.jpg%2F"]}]
     * ok : true
     *//*

    private boolean ok;
    private List<MaleBean> male;
    private List<FemaleBean> female;
    private List<PictureBean> picture;
    private List<PressBean> press;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<MaleBean> getMale() {
        return male;
    }

    public void setMale(List<MaleBean> male) {
        this.male = male;
    }

    public List<FemaleBean> getFemale() {
        return female;
    }

    public void setFemale(List<FemaleBean> female) {
        this.female = female;
    }

    public List<PictureBean> getPicture() {
        return picture;
    }

    public void setPicture(List<PictureBean> picture) {
        this.picture = picture;
    }

    public List<PressBean> getPress() {
        return press;
    }

    public void setPress(List<PressBean> press) {
        this.press = press;
    }

    public static class MaleBean {
        *//**
         * name : 玄幻
         * bookCount : 514683
         * monthlyCount : 21366
         * icon : /icon/玄幻_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1228859%2F_1228859_441552.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F891697%2F_891697_378164.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F41584%2F_41584_123902.jpg%2F"]
         *//*

        private String name;
        private int bookCount;
        private int monthlyCount;
        private String icon;
        private List<String> bookCover;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBookCount() {
            return bookCount;
        }

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }
    }

    public static class FemaleBean {
        *//**
         * name : 古代言情
         * bookCount : 474997
         * monthlyCount : 11803
         * icon : /icon/古代言情_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F2143521%2F2143521_083a5ac565cd458f9b84fcb88adf33fb.png%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1362823%2F_1362823_256513.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F1505754%2F_1505754_955413.jpg%2F"]
         *//*

        private String name;
        private int bookCount;
        private int monthlyCount;
        private String icon;
        private List<String> bookCover;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBookCount() {
            return bookCount;
        }

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }
    }

    public static class PictureBean {
        *//**
         * name : 热血
         * bookCount : 720
         * monthlyCount : 114
         * icon : /icon/热血_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F194607%2F194607_72270909242745fd83336e39b251e874.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F182350%2F41eb45e4c2e740a69140be391ad7cb4a.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F187647%2F187647_6275adb20b7248e487b4162d07911a6d.jpg%2F"]
         *//*

        private String name;
        private int bookCount;
        private int monthlyCount;
        private String icon;
        private List<String> bookCover;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBookCount() {
            return bookCount;
        }

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }
    }

    public static class PressBean {
        *//**
         * name : 传记名著
         * bookCount : 5026
         * monthlyCount : 1528
         * icon : /icon/传记名著_.png
         * bookCover : ["/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F30771%2F_30771_973261.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F42798%2F_42798_755444.jpg%2F","/agent/http%3A%2F%2Fimg.1391.com%2Fapi%2Fv1%2Fbookcenter%2Fcover%2F1%2F53598%2F_53598_122310.jpg%2F"]
         *//*

        private String name;
        private int bookCount;
        private int monthlyCount;
        private String icon;
        private List<String> bookCover;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBookCount() {
            return bookCount;
        }

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public int getMonthlyCount() {
            return monthlyCount;
        }

        public void setMonthlyCount(int monthlyCount) {
            this.monthlyCount = monthlyCount;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<String> getBookCover() {
            return bookCover;
        }

        public void setBookCover(List<String> bookCover) {
            this.bookCover = bookCover;
        }
    }*/
}
