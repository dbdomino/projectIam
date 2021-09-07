function isEmpty(toCheck) {
	var chkstr = toCheck + "";
	var is_Space = true;
	if ((chkstr =="")||(chkstr == null)||(chkstr == "undefined")) {
		return true;
	}
	for (j=0; is_Space && (j<chkstr.length); j++)	{
		if (chkstr.substring(j,j+1) != "")
			is_Space = false;
	}
    return ( is_Space );
}