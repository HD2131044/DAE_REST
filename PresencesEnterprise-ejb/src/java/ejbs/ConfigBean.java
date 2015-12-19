package ejbs;

import entities.Event;
import entities.UserGroup;
import entities.UserGroup.GROUP;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class ConfigBean {

    @EJB
    private AdministratorBean administratorBean;
    @EJB
    private ManagerBean managerBean;
    @EJB
    private AttendantBean attendantBean;
    @EJB
    private EventBean eventBean;
    @EJB
    private CategoryBean categoryBean;

    @PostConstruct
    public void populateDB() {
        try {

            //createUser (String username, String password, String name, String email, UserType type)
            administratorBean.createUser("a_01", "1", "Administrator_Name_01", "administrator_email_01@email.com", GROUP.Administrator);
            administratorBean.createUser("a_02", "2", "Administrator_Name_02", "administrator_email_02@email.com", GROUP.Administrator);
            administratorBean.createUser("a_03", "3", "Administrator_Name_03", "administrator_email_03@email.com", GROUP.Administrator);
            administratorBean.createUser("a_04", "4", "Administrator_Name_04", "administrator_email_04@email.com", GROUP.Administrator);
            administratorBean.createUser("m_01", "11", "Manager_Name_01", "manager_email_01@email.com", GROUP.Manager);
            administratorBean.createUser("m_02", "12", "Manager_Name_02", "manager_email_02@email.com", GROUP.Manager);
            administratorBean.createUser("m_03", "13", "Manager_Name_03", "manager_email_03@email.com", GROUP.Manager);
            administratorBean.createUser("m_04", "14", "Manager_Name_04", "manager_email_04@email.com", GROUP.Manager);
            administratorBean.createUser("m_05", "15", "Manager_Name_05", "manager_email_05@email.com", GROUP.Manager);
            administratorBean.createUser("m_06", "16", "Manager_Name_06", "manager_email_06@email.com", GROUP.Manager);
            administratorBean.createUser("m_07", "17", "Manager_Name_07", "manager_email_07@email.com", GROUP.Manager);
            administratorBean.createUser("m_08", "18", "Manager_Name_08", "manager_email_08@email.com", GROUP.Manager);
            administratorBean.createUser("m_09", "19", "Manager_Name_09", "manager_email_09@email.com", GROUP.Manager);
<<<<<<< HEAD
            administratorBean.createUser("14", "114", "Attendant_Name_01", "attendant_email_01@email.com", GROUP.Attendant);
            administratorBean.createUser("15", "115", "Attendant_Name_02", "attendant_email_02@email.com", GROUP.Attendant);
            administratorBean.createUser("16", "113", "Attendant_Name_03", "attendant_email_03@email.com", GROUP.Attendant);
=======
            administratorBean.createUser("14", "114", "14", "attendant_email_01@email.com", GROUP.Attendant);
            administratorBean.createUser("p_02", "102", "Attendant_Name_02", "attendant_email_02@email.com", GROUP.Attendant);
            administratorBean.createUser("p_03", "103", "Attendant_Name_03", "attendant_email_03@email.com", GROUP.Attendant);
>>>>>>> 810acc2af5d9bbb05a45f4c1af2b2b6815aa335f
            administratorBean.createUser("p_04", "104", "Attendant_Name_04", "attendant_email_04@email.com", GROUP.Attendant);
            administratorBean.createUser("p_05", "105", "Attendant_Name_05", "attendant_email_05@email.com", GROUP.Attendant);
            administratorBean.createUser("p_06", "106", "Attendant_Name_06", "attendant_email_06@email.com", GROUP.Attendant);
            administratorBean.createUser("p_07", "107", "Attendant_Name_07", "attendant_email_07@email.com", GROUP.Attendant);
            administratorBean.createUser("p_08", "108", "Attendant_Name_08", "attendant_email_08@email.com", GROUP.Attendant);
            administratorBean.createUser("p_09", "109", "Attendant_Name_09", "attendant_email_09@email.com", GROUP.Attendant);
            administratorBean.createUser("p_10", "110", "Attendant_Name_10", "attendant_email_10@email.com", GROUP.Attendant);
            administratorBean.createUser("p_11", "111", "Attendant_Name_11", "attendant_email_11@email.com", GROUP.Attendant);
            administratorBean.createUser("p_12", "112", "Attendant_Name_12", "attendant_email_12@email.com", GROUP.Attendant);
            administratorBean.createUser("p_13", "113", "Attendant_Name_13", "attendant_email_13@email.com", GROUP.Attendant);
            administratorBean.createUser("p_14", "114", "Attendant_Name_14", "attendant_email_14@email.com", GROUP.Attendant);
            administratorBean.createUser("p_15", "115", "Attendant_Name_15", "attendant_email_15@email.com", GROUP.Attendant);
            administratorBean.createUser("p_16", "116", "Attendant_Name_16", "attendant_email_16@email.com", GROUP.Attendant);
            administratorBean.createUser("p_17", "117", "Attendant_Name_17", "attendant_email_17@email.com", GROUP.Attendant);
            administratorBean.createUser("p_18", "118", "Attendant_Name_18", "attendant_email_18@email.com", GROUP.Attendant);
            administratorBean.createUser("p_19", "119", "Attendant_Name_19", "attendant_email_19@email.com", GROUP.Attendant);
            administratorBean.createUser("p_20", "120", "Attendant_Name_20", "attendant_email_20@email.com", GROUP.Attendant);
            administratorBean.createUser("p_21", "121", "Attendant_Name_21", "attendant_email_21@email.com", GROUP.Attendant);
            administratorBean.createUser("p_22", "122", "Attendant_Name_22", "attendant_email_22@email.com", GROUP.Attendant);
            administratorBean.createUser("p_23", "123", "Attendant_Name_23", "attendant_email_23@email.com", GROUP.Attendant);
            administratorBean.createUser("p_24", "124", "Attendant_Name_24", "attendant_email_24@email.com", GROUP.Attendant);
            administratorBean.createUser("p_25", "125", "Attendant_Name_25", "attendant_email_25@email.com", GROUP.Attendant);
            administratorBean.createUser("p_26", "126", "Attendant_Name_26", "attendant_email_26@email.com", GROUP.Attendant);
            administratorBean.createUser("p_27", "127", "Attendant_Name_27", "attendant_email_27@email.com", GROUP.Attendant);
            administratorBean.createUser("p_28", "128", "Attendant_Name_28", "attendant_email_28@email.com", GROUP.Attendant);
            administratorBean.createUser("p_29", "129", "Attendant_Name_29", "attendant_email_29@email.com", GROUP.Attendant);
            administratorBean.createUser("p_30", "130", "Attendant_Name_30", "attendant_email_30@email.com", GROUP.Attendant);
            administratorBean.createUser("p_31", "131", "Attendant_Name_31", "attendant_email_31@email.com", GROUP.Attendant);
            administratorBean.createUser("p_32", "132", "Attendant_Name_32", "attendant_email_32@email.com", GROUP.Attendant);
            administratorBean.createUser("p_33", "133", "Attendant_Name_33", "attendant_email_33@email.com", GROUP.Attendant);

            eventBean.createEvent("Evento_1", "Descricao Evento_1", "01/10/2015 12:00", "01/10/2015 13:00");
            eventBean.createEvent("Evento_2", "Descricao Evento_2", "08/10/2015 12:00", "08/10/2015 13:00");
            eventBean.createEvent("Evento_3", "Descricao Evento_3", "09/10/2015 12:00", "09/10/2015 13:00");
            eventBean.createEvent("Evento_4", "Descricao Evento_4", "19/12/2015 12:00", "19/12/2015 19:00");
            eventBean.createEvent("Evento_5", "Descricao Evento_5", "01/10/2015 15:00", "01/10/2015 17:00");
            eventBean.createEvent("Evento_6", "Descricao Evento_6", "01/11/2015 12:00", "02/11/2015 12:00");
            eventBean.createEvent("Evento_7", "Descricao Evento_7", "01/10/2015 12:00", "01/10/2015 13:00");
            eventBean.createEvent("Evento_8", "Descricao Evento_8", "01/10/2015 16:00", "01/10/2015 17:00");
            eventBean.createEvent("Evento_9", "Descricao Evento_9", "01/10/2015 12:00", "01/10/2015 13:00");
            eventBean.createEvent("Evento_10", "Descricao Evento_10", "01/10/2015 18:00", "01/10/2015 19:00");
            eventBean.createEvent("Evento_11", "Descricao Evento_11", "01/10/2015 20:00", "01/10/2015 23:00");
            eventBean.createEvent("Evento_12", "Descricao Evento_12", "01/11/2015 14:00", "01/11/2015 18:00");

            
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("50"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("53"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("54"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("56"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("15"), Long.parseLong("50"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("15"), Long.parseLong("48"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("15"), Long.parseLong("49"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("15"), Long.parseLong("52"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("47"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("15"), Long.parseLong("51"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("17"), Long.parseLong("51"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("16"), Long.parseLong("57"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("22"), Long.parseLong("50"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("16"), Long.parseLong("49"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("17"), Long.parseLong("48"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("18"), Long.parseLong("50"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("20"), Long.parseLong("51"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("19"), Long.parseLong("49"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("19"), Long.parseLong("50"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("20"), Long.parseLong("57"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("21"), Long.parseLong("56"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("18"), Long.parseLong("54"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("18"), Long.parseLong("53"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("16"), Long.parseLong("53"));

            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("49"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("50"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("14"), Long.parseLong("57"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("27"), Long.parseLong("56"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("27"), Long.parseLong("54"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("26"), Long.parseLong("53"));
            attendantBean.enrollAttendantInEvent(Long.parseLong("25"), Long.parseLong("53"));

            managerBean.enrollManagerInEvent(Long.parseLong("5"), Long.parseLong("47"));
            managerBean.enrollManagerInEvent(Long.parseLong("6"), Long.parseLong("47"));
            managerBean.enrollManagerInEvent(Long.parseLong("7"), Long.parseLong("48"));
            managerBean.enrollManagerInEvent(Long.parseLong("8"), Long.parseLong("50"));
            managerBean.enrollManagerInEvent(Long.parseLong("6"), Long.parseLong("57"));
            managerBean.enrollManagerInEvent(Long.parseLong("5"), Long.parseLong("48"));
            managerBean.enrollManagerInEvent(Long.parseLong("5"), Long.parseLong("52"));
            managerBean.enrollManagerInEvent(Long.parseLong("7"), Long.parseLong("52"));
            managerBean.enrollManagerInEvent(Long.parseLong("8"), Long.parseLong("54"));
            managerBean.enrollManagerInEvent(Long.parseLong("6"), Long.parseLong("56"));
            managerBean.enrollManagerInEvent(Long.parseLong("8"), Long.parseLong("56"));
            managerBean.enrollManagerInEvent(Long.parseLong("9"), Long.parseLong("54"));

            categoryBean.createEventCategory("Aula-DAE");
            categoryBean.createEventCategory("Aula-IS");
            categoryBean.createEventCategory("Seminário - Informática no Ensino Básico");
            categoryBean.createEventCategory("Seminário - A Saúde do Ensino Superior Politécnico");
            categoryBean.createEventCategory("Workshop - Software Livre na Pastelaria");
            categoryBean.createEventCategory("Exame - DAE");
            categoryBean.createEventCategory("AulaOT - DAE");

            categoryBean.createAttendantCategory("Engenharia Informática");
            categoryBean.createAttendantCategory("Informática para a Saúde");
            categoryBean.createAttendantCategory("Bolos com Chantilly");

            eventBean.enrollEventInCategory(Long.parseLong("48"), Long.parseLong("59"));
            eventBean.enrollEventInCategory(Long.parseLong("49"), Long.parseLong("59"));
            eventBean.enrollEventInCategory(Long.parseLong("50"), Long.parseLong("59"));
            eventBean.enrollEventInCategory(Long.parseLong("51"), Long.parseLong("59"));
            eventBean.enrollEventInCategory(Long.parseLong("52"), Long.parseLong("60"));
            eventBean.enrollEventInCategory(Long.parseLong("53"), Long.parseLong("60"));
            eventBean.enrollEventInCategory(Long.parseLong("54"), Long.parseLong("60"));
            eventBean.enrollEventInCategory(Long.parseLong("55"), Long.parseLong("60"));
            eventBean.enrollEventInCategory(Long.parseLong("56"), Long.parseLong("61"));
            eventBean.enrollEventInCategory(Long.parseLong("57"), Long.parseLong("61"));
            eventBean.enrollEventInCategory(Long.parseLong("58"), Long.parseLong("61"));
            eventBean.enrollEventInCategory(Long.parseLong("51"), Long.parseLong("61"));
            eventBean.enrollEventInCategory(Long.parseLong("52"), Long.parseLong("61"));
            eventBean.enrollEventInCategory(Long.parseLong("53"), Long.parseLong("62"));
            eventBean.enrollEventInCategory(Long.parseLong("54"), Long.parseLong("62"));
            eventBean.enrollEventInCategory(Long.parseLong("55"), Long.parseLong("62"));

            attendantBean.enrollAttendantInCategory(Long.parseLong("14"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("15"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("16"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("17"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("18"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("19"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("20"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("21"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("22"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("23"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("24"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("25"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("26"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("27"), Long.parseLong("66"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("14"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("15"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("16"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("17"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("21"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("22"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("18"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("19"), Long.parseLong("67"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("16"), Long.parseLong("68"));
            attendantBean.enrollAttendantInCategory(Long.parseLong("17"), Long.parseLong("68"));

            /*
            Event event = eventBean.getEventByName("Evento_5");
            event.setOpenForEnroll(true);
            event.setOpenForPresence(true);
            event.setPassword("dd");
             */
            Event event;
            for (int i = 1; i < 5; i++) {
                event = eventBean.getEventByName("Evento_" + i);
                event.setOpenForEnroll(true);
                eventBean.changePresenceStatus(event.getId());
                event.setPassword("dd");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
