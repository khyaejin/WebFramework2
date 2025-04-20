<c:forEach var="dto" items="${summary.summaries}">
  <tr>
    <td>${dto.year}</td>
    <td>${dto.semester}</td>
    <td>${dto.credit}</td>
  </tr>
</c:forEach>

<tr>
  <td colspan="2">총계</td>
  <td>${summary.totalCredit}</td>
</tr>
