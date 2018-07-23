<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="/css/fullcalendar.min.css" rel="stylesheet" type="text/css" />
<link href="/css/fullcalendar.print.min.css" rel="stylesheet"
	media='print' />
<script src="/js/moment.min.js" type="text/javascript"></script>
<script src="/js/fullcalendar.min.js" type="text/javascript"></script>


<style>
body {
	margin: 40px 10px;
	padding: 0;
	font-family: "Lucida Grande", Helvetica, Arial, Verdana, sans-serif;
	font-size: 14px;
}

#calendar {
	max-width: 900px;
	margin: 0 auto;
}
</style>

<div class="container">

	<div class="row">
		<div class="col-xs-12 col-md-6">
			<br />
			<h2>Consultas</h2>

		</div>
	</div>
	<hr />
	<div id='calendar'></div>
</div>

<script>
	$(document).ready(function() {

        var calendar = $('#calendar').fullCalendar({
            header: {
                left: 'prev,next today',
                center: 'title',
                right: 'month,agendaWeek,agendaDay'
                    },
                selectable: true,
                selectHelper: true,

            select: function(start, end, allDay) {
                    var title = prompt('Event Title:');
                    if (title) {
                        calendar.fullCalendar('renderEvent',
                        {
                            title: title,
                            start: start,
                            end: end,
                            allDay: allDay
                        },
                        true // make the event "stick"
                        );
                        }
                        calendar.fullCalendar('unselect');
                    },
                            editable: true,

                            eventSources: [
                                {
                                        url: '/consulta/consultas',
                                        type: 'GET',
                                        data: {
                                            start: 'start',
                                            end: 'end',
                                            id: 'id',
                                            title: 'title',
                                            allDay: 'allDay'
                                        },
                                        error: function () {
                                            alert('there was an error while fetching events!');
                                        }
                                }
                        ]         
                });
        });
</script>



<%@ include file="/WEB-INF/views/footer.jsp"%>