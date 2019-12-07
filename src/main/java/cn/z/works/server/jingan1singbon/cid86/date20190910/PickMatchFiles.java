package cn.z.works.server.jingan1singbon.cid86.date20190910;
import cn.z.utils.Utils;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
/***
 * @class PickMatchFiles
 * @description 查找文件名匹配的文件
 * @author zch
 * @date 2019/8/15
 * @version V0.0.1.201908150917.01
 * @modfiyDate 201908150917
 * @createDate 201908150917
 * @package cn.z
 */
public class PickMatchFiles {
	private static int[] deviceNum = {80002, 80005, 80006, 80007, 80008, 80009, 80010, 80011, 80012, 80013, 80014, 80015, 80016, 80017, 80018, 80019, 80020, 80021, 80022, 80023, 80024, 80025, 80026, 80027, 80028, 80029, 80030, 80031, 80032, 80033, 80034, 80035, 80036, 80037, 80038, 80039, 80040, 80041, 80042, 80043, 80044, 80045, 80046, 80047, 80048, 80049, 80050, 80051, 80052, 80053, 80054, 80055, 80056, 80057, 80058, 80059, 80060, 80061, 80062, 80063, 80064, 80065, 80066, 80067, 80068, 80069, 80070, 80071, 80072, 80073, 80074, 80075, 80076, 80077, 80078, 80079, 80080, 80081, 80082, 80083, 80084, 80085, 80086, 80087, 80088, 80089, 80090, 80091, 80092, 80093, 80094, 80095, 80096, 80097, 80098, 80099, 80100, 80101, 80102, 80103, 80104, 80105, 80106, 80107, 80108, 80109, 80110, 80111, 80112, 80113, 80114, 80115, 80116, 80117, 80118, 80119, 80120, 80121, 80122, 80123, 80124, 80125, 80126, 80127, 80128, 80129, 80130, 80131, 80132, 80133, 80134, 80135, 80136, 80137, 80138, 80139, 80140, 80141, 80142, 80143, 80144, 80145, 80146, 80147, 80148, 80149, 80150, 80151, 80152, 80153, 80154, 80155, 80156, 80157, 80158, 80159, 80160, 80161, 80162, 80163, 80164, 80165, 80166, 80167, 80168, 80169, 80170, 80171, 80172, 80173, 80174, 80175, 80176, 80177, 80178, 80179, 80180, 80181, 80182, 80183, 80184, 80185, 80186, 80187, 80188, 80189, 80190, 80191, 80192, 80193, 80194, 80195, 80196, 80197, 80198, 80199, 80200, 80201, 80202, 80203, 80204, 80205, 80206, 80207, 80208, 80209, 80210, 80211, 80212, 80213, 80215, 80216, 80217, 80218, 80219, 80220, 80221, 80222, 80223, 80224, 80225, 80226, 80227, 80228, 80229, 80230, 80231, 80232, 80233, 80234, 80235, 80236, 80237, 80238, 80239, 80240, 80241, 80242, 80243, 80244, 80245, 80246, 80247, 80248, 80249, 80250, 80251, 80255, 80256, 80257, 80258, 80259, 80260, 80261, 80262, 80263, 80264, 80265, 80266, 80267, 80268, 80269, 80270, 80271, 80272, 80273, 80274, 80275, 80276, 80277, 80278, 80279, 80280, 80281, 80282, 80283, 80284, 80285, 80286, 80287, 80288, 80289, 80290, 80291, 80292, 80293, 80294, 80295, 80296, 80297, 80298, 80299, 80300, 80301, 80302, 80303, 80304, 80305, 80306, 80307, 80308, 80309, 80310, 80311, 80312, 80313, 80314, 80315, 80316, 80317, 80318, 80319, 80320, 80321, 80322, 80323, 80324, 80325, 80326, 80327, 80328, 80329, 80330, 80331, 80332, 80333, 80334, 80335, 80336, 80337, 80338, 80339, 80340, 80341, 80342, 80343, 80344, 80345, 80346, 80347, 80348, 80349, 80350, 80351, 80352, 80353, 80354, 80355, 80356, 80357, 80358, 80359, 80360, 80361, 80362, 80363, 80364, 80365, 80366, 80367, 80368, 80369, 80370, 80371, 80372, 80373, 80374, 80375, 80376, 80377, 80378, 80379, 80380, 80381, 80382, 80383, 80384, 80385, 80386, 80387, 80388, 80389, 80390, 80391, 80392, 80393, 80394, 80395, 80396, 80397, 80398, 80399, 80400, 80401, 80402, 80403, 80404, 80405, 80406, 80407, 80408, 80409, 80410, 80411, 80412, 80413, 80414, 80415, 80416, 80417, 80418, 80419, 80420, 80421, 80422, 80423, 80424, 80425, 80426, 80427, 80428, 80429, 80430, 80431, 80432, 80433, 80434, 80435, 80436, 80437, 80438, 80439, 80441, 80442, 80443, 80444, 80445, 80446, 80447, 80448, 80449, 80450, 80451, 80452, 80453, 80454, 80455, 80456, 80457, 80458, 80459, 80460, 80461, 80462, 80463, 80464, 80465, 80466, 80467, 80468, 80469, 80470, 80471, 80472, 80473, 80474, 80475, 80476, 80477, 80478, 80479, 80480, 80481, 80482, 80483, 80484, 80485, 80486, 80487, 80488, 80489, 80490, 80491, 80492, 80493, 80494, 80495, 80496, 80497, 80498, 80499, 80500, 80501, 80502, 80503, 80504, 80505, 80506, 80507, 80508, 80509, 80510, 80511, 80512, 80513, 80514, 80515, 80516, 80517, 80518, 80519, 80520, 80521, 80522, 80523, 80524, 80525, 80526, 80527, 80528, 80529, 80530, 80531, 80532, 80533, 80534, 80535, 80536, 80537, 80538, 80539, 80540, 80541, 80542, 80543, 80544, 80545, 80546, 80547, 80548, 80549, 80550, 80551, 80552, 80553, 80554, 80555, 80556, 80557, 80558, 80559, 80560, 80561, 80562, 80563, 80564, 80565, 80566, 80567, 80568, 80569, 80570, 80571, 80572, 80573, 80574, 80575, 80576, 80577, 80578, 80579, 80580, 80581, 80582, 80583, 80584, 80585, 80586, 80587, 80588, 80589, 80590, 80591, 80592, 80593, 80594, 80595, 80596, 80597, 80598, 80599, 80600, 80601, 80602, 80603, 80604, 80605, 80606, 80607, 80608, 80609, 80610, 80611, 80612, 80613, 80614, 80615, 80616, 80617, 80618, 80619, 80620, 80621, 80622, 80623, 80624, 80625, 80626, 80627, 80628, 80629, 80630, 80631, 80632, 80633, 80634, 80635, 80636, 80637, 80638, 80639, 80640, 80641, 80642, 80643, 80644, 80645, 80646, 80647, 80648, 80649, 80650, 80651, 80652, 80653, 80654, 80655, 80656, 80657, 80658, 80659, 80660, 80661, 80662, 80663, 80664, 80665, 80666, 80667, 80668, 80669, 80670, 80671, 80672, 80673, 80674, 80675, 80676, 80677, 80678, 80679, 80680, 80681, 80682, 80683, 80684, 80685, 80686, 80687, 80688, 80689, 80690, 80691, 80692, 80693, 80694, 80695, 80696, 80697, 80698, 80699, 80700, 80701, 80702, 80703, 80704, 80705, 80706, 80707, 80708, 80709, 80710, 80711, 80712, 80713, 80714, 80715, 80716, 80717, 80718, 80719, 80720, 80721, 80722, 80723, 80724, 80725, 80726, 80727, 80728, 80729, 80730, 80731, 80732, 80733, 80734, 80735, 80736, 80737, 80738, 80739, 80740, 80741, 80742, 80743, 80744, 80745, 80746, 80747, 80748, 80749, 80750, 80751, 80752, 80753, 80754, 80755, 80756, 80757, 80758, 80759, 80760, 80761, 80762, 80763, 80764, 80765, 80766, 80767, 80768, 80769, 80770, 80771, 80772, 80773, 80774, 80775, 80776, 80777, 80778, 80779, 80780, 80781, 80782, 80783, 80784, 80785, 80786, 80787, 80788, 80789, 80790, 80791, 80792, 80793, 80794, 80795, 80796, 80797, 80798, 80799, 80800, 80801, 80802, 80803, 80804, 80805, 80806, 80807, 80808, 80809, 80810, 80811, 80812, 80813, 80814, 80815, 80816, 80817, 80818, 80819, 80820, 80821, 80822, 80823, 80824, 80825, 80826, 80827, 80828, 80829, 80830, 80831, 80832, 80833, 80834, 80835, 80836, 80837, 80838, 80839, 80840, 80841, 80842, 80843, 80844, 80845, 80846, 80847, 80848, 80849, 80850, 80851, 80852, 80853, 80854, 80855, 80856, 80857, 80858, 80859, 80860, 80861, 80862, 80863, 80864, 80865, 80866, 80867, 80868, 80869, 80870, 80871, 80872, 80873, 80874, 80875, 80876, 80877, 80878, 80879, 80880, 80881, 80882, 80883, 80884, 80885, 80886, 80887, 80888, 80889, 80890, 80891, 80892, 80893, 80894, 80895, 80896, 80897, 80898, 80899, 80900, 80901, 80902, 80903, 80904, 80905, 80906, 80907, 80908, 80909, 80910, 80911, 80912, 80913, 80914, 80915, 80916, 80917, 80918, 80919, 80920, 80921, 80922, 80923, 80924, 80925, 80926, 80927, 80928, 80929, 80930, 80931, 80932, 80933, 80934, 80935, 80936, 80937, 80938, 80939, 80940, 80941, 80942, 80943, 80944, 80945, 80946, 80947, 80948, 80949, 80950, 80951, 80952, 80953, 80954, 80955, 80956, 80957, 80958, 80959, 80960, 80961, 80962, 80963, 80964, 80965, 80966, 80967, 80968, 80969, 80970, 80971, 80972, 80973, 80974, 80975, 80976, 80977, 80978, 80979, 80980, 80981, 80982, 80983, 80984, 80985, 80986, 80987, 80988, 80989, 80990, 80991, 80992, 80993, 80994, 80995, 80996, 80997, 80998, 80999, 81000, 81001, 81002, 81003, 81004, 81005, 81006, 81007, 81008, 81009, 81010, 81011, 81012, 81013, 81014, 81015, 81016, 81017, 81018, 81019, 81020, 81021, 81022, 81023, 81024, 81025, 81026, 81027, 81028, 81029, 81030, 81031, 81032, 81033, 81034, 81035, 81036, 81037, 81038, 81039, 81040, 81041, 81042, 81043, 81044, 81045, 81046, 81047, 81048, 81049, 81050, 81051, 81052, 81053, 81054, 81055, 81056, 81057, 81058, 81059, 81060, 81061, 81062, 81063, 81064, 81065, 81066, 81067, 81068, 81069, 81070, 81071, 81072, 81073, 81074, 81075, 81076, 81077, 81078, 81079, 81080, 81081, 81082, 81083, 81084, 81085, 81086, 81087, 81088, 81089, 81090, 81091, 81092, 81093, 81094, 81095, 81096, 81097, 81098, 81099, 81100, 81101, 81103, 81104, 81105, 81106, 81107, 81108, 81110, 81111, 81113, 81114, 81115, 81116, 81117, 81118, 81119, 81120, 81121, 81122, 81123, 81124, 81125, 81126, 81127, 81128, 81129, 81130, 81131, 81132, 81133, 81134, 81135, 81136, 81137, 81138, 81139, 81140, 81141, 81142, 81143, 81144, 81145, 81146, 81147, 81148, 81149, 81150, 81151, 81152, 81153, 81154, 81155, 81156, 81157, 81158, 81159, 81160, 81161, 81162, 81163, 81164, 81165, 81166, 81167, 81168, 81169, 81170, 81171, 81172, 81173, 81174, 81175, 81176, 81177, 81178, 81179, 81180, 81181, 81182, 81183, 81184, 81185, 81186, 81187, 81188, 81189, 81190, 81191, 81192, 81193, 81194, 81195, 81196, 81197, 81198, 81199, 81200, 81201, 81202, 81203, 81204, 81205, 81206, 81207, 81208, 81209, 81210, 81211, 81212, 81213, 81214, 81215, 81216, 81217, 81218, 81219, 81220, 81221, 81222, 81223, 81224, 81225, 81226, 81227, 81228, 81229, 81230, 81231, 81232, 81233, 81234, 81235, 81236, 81237, 81238, 81239, 81240, 81241, 81242, 81243, 81244, 81245, 81246, 81247, 81248, 81249, 81250, 81251, 81252, 81253, 81254, 81255, 81256, 81257, 81258, 81259, 81260, 81261, 81262, 81263, 81264, 81265, 81266, 81267, 81268, 81269, 81270, 81271, 81272, 81273, 81274, 81275, 81276, 81277, 81278, 81279, 81280, 80001, 80440, 80253, 80254, 80252, 81112, 81109, 81102, 80214, 80003, 80004, 81281, 81282, 81283, 81284, 81285, 81286, 81287, 81288, 81290, 81291, 81292, 81293, 81294, 81295, 81296, 81297, 81298, 81299, 81300, 81301, 1601, 1602, 1603, 1604, 1605, 1606, 1607, 1608, 1609, 1610, 1611, 1612, 1613, 1614, 1615, 1616, 1617, 1618, 1619, 1620, 1621, 1622, 1623, 1624, 16274, 16275, 16276, 16277, 16278, 16279, 16280, 16281, 17343, 17344, 17345, 17347, 17364, 17365, 17366, 17346, 17348};
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		// 需要分析的文件夹路径
		//System.out.println("输入要分析的文件夹路径：");
		//String scanPath = s.next();
		List<List<String>> headList = new ArrayList<>();
		List<String> headListStr = new ArrayList<>();
		headListStr.add("a");
		headListStr.add("b");
		headListStr.add("c");
		headListStr.add("d");
		headList.add(headListStr);
		List<List<Object>> contentList = new ArrayList<>();
		List<Object> contentListObj = new ArrayList<>();
		contentListObj.add(1);
		contentListObj.add(2);
		contentListObj.add(3);
		contentListObj.add(4);
		contentList.add(contentListObj);
		writeToExce(headList,contentList);
	}
	private static void analyseLogs(String scanPath) {
		ArrayList<String> match = new ArrayList<>();
		ArrayList<Object> allFiles = Utils.scanFilesWithRecursion(scanPath);
		ArrayList<Object> allDeviceNumFromFile = new ArrayList<>();
		ArrayList<Object> allDeviceNumFromData = new ArrayList<>();
		ArrayList<String> onLine = new ArrayList<>();
		ArrayList<String> offLine = new ArrayList<>();
		String hisLogPath;
		/* ========================== */
		for (int n : deviceNum) {
			allDeviceNumFromData.add(n);
		}
		for (Object o : allFiles) {
			File f = new File(o.toString());
			allDeviceNumFromFile.add(f.getName().split("-")[0]);
		}
		System.out.println(allDeviceNumFromData.size());
		System.out.println(allDeviceNumFromFile.size());
		System.out.println("================================");
		allDeviceNumFromData = new ArrayList<>(new HashSet<>(allDeviceNumFromData));
		allDeviceNumFromFile = new ArrayList<>(new HashSet<>(allDeviceNumFromFile));
		System.out.println(allDeviceNumFromData.size());
		System.out.println(allDeviceNumFromFile.size());
		System.out.println(allDeviceNumFromData);
		System.out.println(allDeviceNumFromFile);
		for (Object allDeviceNumFromDatum : allDeviceNumFromData) {
			String sData = allDeviceNumFromDatum.toString();
			for (Object o : allDeviceNumFromFile) {
				String fileData = o.toString();
				if (sData.equals(fileData)) {
					System.out.println("相同：" + allDeviceNumFromDatum + "-" + o);
					match.add(sData);
				}
			}
		}
		match = new ArrayList<>(new HashSet<>(match));
		System.out.println("在线:" + match.size() + " " + match);
		for (Object allDeviceNumFromDatum : allDeviceNumFromData) {
			boolean isNotExit = true;
			String sData = allDeviceNumFromDatum.toString();
			for (String s : match) {
				String fileData = s.toString();
				if (sData.equals(fileData)) {
					isNotExit = false;
					onLine.add(sData);
					break;
				}
			}
			if (isNotExit) {
				offLine.add(sData);
			}
		}
		int onLineSize = onLine.size();
		int offLineSize = offLine.size();
		int dataListMaxSize = Math.max(onLineSize, offLineSize);
		int dataListMinSize = Math.min(onLineSize, offLineSize);
		System.out.println("在线:" + onLineSize + " " + onLine);
		System.out.println("离线:" + offLineSize + " " + offLine);
		System.out.println("总计:" + (offLineSize + onLineSize) + "=" + deviceNum.length);
		List<List<String>> headList = new ArrayList<>();
		List<String> headCoulumn1 = new ArrayList<>();
		List<String> headCoulumn2 = new ArrayList<>();
		headCoulumn1.add("在线");
		headCoulumn2.add("离线");
		headList.add(headCoulumn1);
		headList.add(headCoulumn2);
		List<List<Object>> dataList = new ArrayList<>();
		for (int i = 0; i < dataListMaxSize; i++) {
			List<Object> dataSubList = new ArrayList<>();
			Object onData;
			Object offData;
			if (i >= onLine.size()) {
				onData = 0;
			}
			else {
				onData = onLine.get(i);
			}
			if (i >= offLine.size()) {
				offData = 0;
			}
			else {
				offData = offLine.get(i);
			}
			dataSubList.add(onData);
			dataSubList.add(offData);
			dataList.add(dataSubList);
		}
		writeToExce(headList, dataList);
	}
	public static void writeToExce(List<List<String>> headList, List<List<Object>> dataList) {
		try {
			OutputStream out = new FileOutputStream("E:\\aaaaaaaaaaaaaaaa\\东莞技师学院设备通讯统计" + System.currentTimeMillis() + ".xlsx");
			ExcelWriter writer = EasyExcelFactory.getWriter(out);
			//写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
			Sheet sheet1 = new Sheet(1, 3);
			sheet1.setSheetName("第一个sheet");
			//设置列宽 设置每列的宽度
			sheet1.setHead(headList);
			//or 设置自适应宽度
			sheet1.setAutoWidth(Boolean.TRUE);
			writer.write1(dataList, sheet1);
			writer.finish();
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}