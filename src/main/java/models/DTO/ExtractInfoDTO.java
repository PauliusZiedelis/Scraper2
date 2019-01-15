package models.DTO;

import java.util.ArrayList;

import models.FlyInfoDirect;
import models.FlyInfoWithConnection;

public class ExtractInfoDTO {
	public boolean isSuccess;
	public ArrayList<FlyInfoDirect> directAList;
	public ArrayList<FlyInfoDirect> directBList;
	public ArrayList<FlyInfoWithConnection> withConectionAList;
	public ArrayList<FlyInfoWithConnection> withConectionBList;
}
