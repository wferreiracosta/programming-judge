/*Please add ; after each select statement*/
CREATE PROCEDURE projectList()
BEGIN
	select project_name, team_lead, income FROM Projects;
END