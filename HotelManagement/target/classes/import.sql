INSERT INTO `hotelmanagement`.`roles` (`roleid`, `description`, `name`) VALUES ('1', 'ADMIN can be a boss', 'ADMIN');
INSERT INTO `hotelmanagement`.`roles` (`roleid`, `description`, `name`) VALUES ('2', 'USER can access only few features', 'USER');
INSERT INTO `hotelmanagement`.`roles` (`roleid`, `description`, `name`) VALUES ('3', 'VISITOR can get minimal features', 'VISITOR');



INSERT INTO `hotelmanagement`.`user_table` (`userid`, `confirm_password`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobile_no`, `password`, `roleid`) VALUES ('1', 'Pass', '1999-04-23 00:00:00.000000', 'vijay', 'm', 'poiuytrewq', 'reddy', 'VKUMBAM', '987654321', 'Pass', '1');
INSERT INTO `hotelmanagement`.`user_table` (`userid`, `confirm_password`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobile_no`, `password`, `roleid`) VALUES ('2', 'Pass', '1999-04-23 00:00:00.000000', 'lalitha', 'm', 'poiuytrewq', 'reddy', 'VKUMBAM', '987654321', 'Pass', '1');
INSERT INTO `hotelmanagement`.`user_table` (`userid`, `confirm_password`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobile_no`, `password`, `roleid`) VALUES ('3', 'Pass', '1999-04-23 00:00:00.000000', 'venkat', 'm', 'poiuytrewq', 'reddy', 'VKUMBAM', '987654321', 'Pass', '2');
INSERT INTO `hotelmanagement`.`user_table` (`userid`, `confirm_password`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobile_no`, `password`, `roleid`) VALUES ('4', 'Pass', '1999-04-23 00:00:00.000000', 'ASHOK', 'm', 'poiuytrewq', 'reddy', 'VKUMBAM', '987654321', 'Pass', '2');


INSERT INTO `hotelmanagement`.`hosteltable` (`hostelid`, `address`, `contact`, `description`, `fee`, `hostelname`, `hosteltype`) VALUES ('1', 'Hyderabad', '0987612345', 'Pollution  free', '5000', 'VIJAYGIRLS', 'Normal');
INSERT INTO `hotelmanagement`.`hosteltable` (`hostelid`, `address`, `contact`, `description`, `fee`, `hostelname`, `hosteltype`) VALUES ('2', 'Ammerpet', '0987612345', 'Pollution  free', '5000', 'VIJAYGIRLS', 'Normal');
INSERT INTO `hotelmanagement`.`hosteltable` (`hostelid`, `address`, `contact`, `description`, `fee`, `hostelname`, `hosteltype`) VALUES ('3', 'Nalgonda,Nakrekal', '0987612345', 'Pollution  free', '5000', 'VIJAYGIRLS', 'Normal');


INSERT INTO `hotelmanagement`.`warden` (`wardenid`, `login`, `wardenname`, `user_wardens`, `hostel_wardens`) VALUES ('1', 'AKUMBAM', 'wardenAshok', '1', '1');
INSERT INTO `hotelmanagement`.`warden` (`wardenid`, `login`, `wardenname`, `user_wardens`, `hostel_wardens`) VALUES ('2', 'AKUMBAM', 'wardenAshok', '1', '2');
INSERT INTO `hotelmanagement`.`warden` (`wardenid`, `login`, `wardenname`, `user_wardens`, `hostel_wardens`) VALUES ('3', 'AKUMBAM', 'wardenAshok', '1', '1');


